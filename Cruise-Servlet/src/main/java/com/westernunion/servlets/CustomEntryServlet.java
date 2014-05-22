package com.westernunion.servlets;

import java.io.IOException;
import java.util.StringTokenizer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.westernunion.constants.WebAppConstants;
import com.westernunion.constants.WebConstants;
import com.westernunion.utils.CryptoUtil;





/**
 * 1. Gets POST parameters. 
 * 2. Encrypts wuData & makes POST call to endpoint. 
 * 3. Parses response to check user data.
 * 4. Redirects to appropriate page.
 * 
 * @author Vipul.Zadoo00000000000
 */
@Component
@Service(javax.servlet.Servlet.class)
@Properties({ @Property(name = "sling.servlet.paths", value = "/login"), @Property(name = "sling.servlet.methods", value = { "GET", "POST" }) })
public class CustomEntryServlet extends SlingAllMethodsServlet {

	/** serialVersionUID */
	private static final long serialVersionUID = -3960692666512058118L;

	/** The logger constant. */
	final private static Logger LOG = LoggerFactory.getLogger(CustomEntryServlet.class);

	/**
	 * Does something to GET requests.
	 * 
	 * @param servletRequest <code>SlingHttpServletRequest</code>
	 * @param servletResponse <code>SlingHttpServletResponse</code>
	 * @throws IOException <code>java.io.IOException</code>
	 * @throws ServletException <code>javax.servlet.ServletException</code>
	 */
	@Override
	protected void doGet(final SlingHttpServletRequest servletRequest, final SlingHttpServletResponse servletResponse) throws ServletException,
			IOException {

		boolean isErrorPage = false;
		final String languageCode = servletRequest
				.getParameter(WebConstants.LANGUAGE);
		final String countryCode = servletRequest
				.getParameter(WebConstants.COUNTRY);

		// Get wudata from parameters.
		final String wuData = CryptoUtil.decodeAsBase64(servletRequest
				.getParameter(WebConstants.WUDATA));
		if (wuData == null) {
			isErrorPage = true;
		} else {
			StringTokenizer st = new StringTokenizer(wuData,
					WebAppConstants.COMMA);
			HttpSession session = servletRequest.getSession();
			while (st.hasMoreTokens()) {
				String wuDataValue = (String) st.nextElement();
				if (wuDataValue == null) {
					isErrorPage = true;
				} else if (wuDataValue.contains(WebAppConstants.EQUALS)) {
					String substring = wuDataValue.substring(0,
							wuDataValue.indexOf(WebAppConstants.EQUALS));
					String param = wuDataValue.substring((wuDataValue
							.indexOf(WebAppConstants.EQUALS) + 1));
					if (param == null || param.equals("")) {
						isErrorPage = true;
						break;
					}
					if (substring.equals(WebAppConstants.EMP_ID)) {

						session.setAttribute(WebAppConstants.EMP_ID, param);

					} else if (substring.equals(WebAppConstants.TIME_STAMP)) {

						session.setAttribute(WebAppConstants.TIME_STAMP, param);
						System.out.println("TIME_STAMP=" + param);
					} else if (substring.equals(WebAppConstants.SHARED_SECRET)) {

						session.setAttribute(WebAppConstants.SHARED_SECRET,
								param);
						System.out.println("SHARED_SECRET=" + param);

					} else if (substring.equals(WebAppConstants.CLIENT_ID)) {

						session.setAttribute(WebAppConstants.CLIENT_ID, param);
						System.out.println("CLIENT_ID=" + param);
					} else if (substring.equals(WebAppConstants.PROVIDER_ID)) {
						session.setAttribute(WebAppConstants.PROVIDER_ID, param);
						System.out.println("PROVIDER_ID=" + param);
					}

				}
			}
		}

		// Error scenario. Redirect to ERROR/LOGIN page.

		org.apache.sling.api.wrappers.SlingHttpServletRequestWrapper req =

		new org.apache.sling.api.wrappers.SlingHttpServletRequestWrapper(
				servletRequest) {

			public String getMethod() {

				return "GET";

			}

		};

		String path = "";
		if (isErrorPage) {
			path = WebConstants.ERRORURL;
		} else {
			path = WebConstants.LOGINURL;
		}

		javax.servlet.RequestDispatcher dispatcher = servletRequest
				.getRequestDispatcher(path);

		dispatcher.include(req, servletResponse);
	}

	/**
	 * Does something to POST requests.
	 * 
	 * @param servletRequest
	 *            <code>SlingHttpServletRequest</code>
	 * @param servletResponse
	 *            <code>SlingHttpServletResponse</code>
	 * @throws IOException
	 *             <code>java.io.IOException</code>
	 * @throws ServletException
	 *             <code>javax.servlet.ServletException</code>
	 */
	@Override
	protected void doPost(final SlingHttpServletRequest servletRequest,
			final SlingHttpServletResponse servletResponse)
			throws ServletException, IOException {
		doGet(servletRequest, servletResponse);
	}
	
}
