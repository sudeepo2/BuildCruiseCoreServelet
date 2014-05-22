package com.westernunion.constants;

public class WebAppConstants {
	

		 public static final String USER_SESSION = "USER_SESSION";
		 public static final String CS_SESSION_ID = "CS_SESSION_ID";
		public static final String INVALID_SESSION = "INVALID_SESSION";
		 public static final String CS_SESSION_TIMESTAMP = "CS_SESSION_TIMESTAMP";
		 public static final String CS_SESSION_THRESHOLD = "CS_SESSION_THRESHOLD";

		 public static final String COUNTRY_COOKIE = "WUCountryCookie_";
		 public static final String LANGUAGE_COOKIE = "WULanguageCookie_";
		 public static final String REGION_COOKIE = "region";
	 public static final String LOGIN_STATE_COOKIE = "loggedin";
		public static final String GAMMA_SITE_COOKIE = "GAMMA_SITE";

		public static final String CS_Transaction_History_Error_Code = "D0004";

		public static final String CS_ERROR_USER_ACCOUNT_LOCKED = "10253";

		public static final String CS_ERROR_CODE = "CS_ERROR_CODE";
		public static final String CS_ERROR_MESSAGE = "CS_ERROR_MESSAGE";

		public static final String CAPTCHA_FLAG = "CAPTCHA_FLAG";
		public static final String PROJECT_NAME = "WUDigital";
		public static final String APP_NAME = "WebAPP-R2";
		public static final String CONTEXT_PATH = "/WebAppR2";
		public static final String ENV_PROPERTY = "webapp.env";
		public static final String ENV_NAME_DEV = "DEV";
		public static final String ENV_NAME_QA = "QA";
		public static final String ENV_NAME_UAT = "UAT";
		public static final String ENV_NAME_PRODUCTION = "PRODUCTION";

		public static final String SECURITY_ANSWER_MASK = "*****";

		public static final String CREDIT_CARD_MASK = "********************";
		public static final String CLIENT_IP = "client_ip";
		public static final String FORMATED_CLIENT_IP = "formated_client_ip";

		public static final String DB_CAN_STATE_LIST = "CAN_STATE_LIST";
		public static final String DB_APP_COUNTRY_LIST = "APP_COUNTRY_LIST";
		public static final String DB_MEX_STATE_LIST = "MEX_STATE_LIST";
		public static final String DB_USA_STATE_LIST = "USA_STATE_LIST";
		public static final String DB_CREDIT_CARD_TYPES = "CREDIT_CARD_TYPES";

		public static final String DB_PROFILE_SECURITY_QUESTIONS = "PROFILE_SECURITY_QUESTIONS";
		public static final String DB_APP_LANGUAGE_LIST = "APP_LANGUAGE_LIST";
		public static final String DB_LABELS_LIST = "LABELS_LIST";
		public static final String DB_ALERTS_LIST = "ALERTS_LIST";
		public static final String DB_VALIDATIONS_LIST = "VALIDATIONS_LIST";
		public static final String DB_URLS_LIST = "URLS_LIST";
		public static final String DB_DESTINATION_COUNTRY_LIST = "DESTINATION_COUNTRY_LIST";
		public static final String DB_INTL_DIALING_PREF_LIST = "INTL_DIALING_PREF_LIST";
		public static final String DB_PHONE_NUMBERS_LIST = "PHONE_NUMBERS_LIST";
		public static final String DB_SOURCE_CURRENCY = "SOURCE_CURRENCY";
		public static final String DB_D2B_TEMPLATES_LIST = "D2B_TEMPLATES_LIST";
		public static final String DB_FEATURES_LIST = "FEATURES_LIST";
		public static final String DB_DELIVERY_SERVICES_LIST = "DELIVERY_SERVICES_LIST";

		public static final String FILTER_DELIMITER = ",";

		// Payment Pages
		public static final String PAYMENT_PAGE = "PAYMENT_PAGE";
		public static final String PAYMENT_PAGE_REGISTERED_CREDIT_CARD = "paymentWithRegistedCreditCard";
		public static final String PAYMENT_PAGE_CREDIT_CARD = "paymentWithCreditCard";
		public static final String PAYMENT_PAGE_WUPAY = "paymentWithWUpay";
		public static final String PAYMENT_PAGE_REGISTERED_ACH = "paymentWithRegisterdACH";
		public static final String PAYMENT_PAGE_ACH = "paymentWithACH";

		// receiver Pages
		public static final String RECEIVER_PAGE = "RECEIVER_PAGE";
		public static final String RECEIVE_INTO_BANK = "RECEIVE_INTO_BANK";
		public static final String RECEIVE_AT_AGENT_LOCATION = "RECEIVE_AT_AGENT_LOCATION";
		public static final String RECEIVE_INTO_MOBILE = "RECEIVE_INTO_MOBILE";
		public static final String RECEIVE_ON_PREPAID_CARD = "RECEIVE_ON_PREPAID_CARD";

		// Product Name
		public static final String WU_PRODUCT_RECEIVE_INTO_BANK = "500";
		public static final String WU_PRODUCT_RECEIVE_AT_AGENT_LOCATION = "000";
		public static final String WU_PRODUCT_RECEIVE_INTO_MOBILE = "600";
		public static final String WU_PRODUCT_RECEIVE_ON_PREPAID_CARD = "800";
		public static final String WU_PRODUCT_MT_NEXT_DAY_RECEIVE_AT_AGENT_LOCATION = "300";

		// Payment Type
		public static final String PAYMENT_TYPE_CREDIT_CARD = "CREDIT_CARD";
		public static final String PAYMENT_TYPE_WU_PAY = "WU_PAY";
		public static final String PAYMENT_TYPE_ACH = "ACH";
		public static final String PAYMENT_TYPE_CASH = "CASH";
		public static final String PAY_IN_TYPE = "PAY_IN_TYPE";
		public static final String PAY_OUT_TYPE = "PAY_OUT_TYPE";

		public static final String CARD_TYPE_VISA = "VISA";
		public static final String CARD_TYPE_MASTERCARD = "MASTER";
		public static final String CARD_TYPE_DISCOVER = "DISCOVER";

		public static final String TRANSACTION_TYPE = "transaction_type";
		public static final String TRANSACTION_LIMIT = "transaction_limit";
		public static final String TRANSACTION_MIN_LIMIT = "transaction_min_limit";
		public static final String TRANSACTION_MAX_LIMIT = "transaction_max_limit";
		public static final String TRANSACTION_CODE = "transaction_code";
		public static final String MAX_LIMIT = "max_limit";
		public static final String QUICKCOLLECT_LIMIT = "QUICKCOLLECT";
		public static final String PERSONAL_LIMIT = "PERSONAL";
		public static final String CORRIDOR_LIMIT = "CORRIDOR";

		public static final String ACCULYNK_PINPAD_LAUNCHED = "acculynkPinPadLaunched";
		public static final String ACCULYNK_RESPONSE_CODE = "acculynkResponseCode";
		public static final String FETCH_FROM_DB = "FETCH_FROM_DB";
		public static final String USERNAME_192 = "USERNAME_192";
		public static final String PASSWORD_192 = "PASSWORD_192";
		public static final String CIPHER_KEY_192 = "CIPHER_KEY_192";

		public static final String KYC_DOC_TYPES = "KYC_DOC_TYPES";
		public static final String HEALTH_CHECK_URL_192 = "HEALTH_CHECK_URL_192";
		public static final String DOC_UPLOAD_URL_192 = "DOC_UPLOAD_URL_192";

		public static final String PRIVATE_KEY_192_FILE_PATH = "private.key.192.file.path";
		public static final String PUBLIC_KEY_192_FILE_PATH = "public.key.192.file.path";
		public static final String CARDINAL_ACHEX_PUBLIC_KEY_FILE_PATH = "publicKey.cardinal.achex.file.path";
		public static final String CARDINAL_PRIVATE_KEY_FILE_PATH = "privateKey.cardinal.file.path";
		public static final String CARDINAL_PUBLIC_KEY_FILE_PATH = "publicKey.cardinal.file.path";

		public static final String PRIVATE_KEY_192 = "private.key.192";
		public static final String PUBLIC_KEY_192 = "public.key.192";
		public static final String CARDINAL_ACHEX_PUBLIC_KEY = "publicKey.cardinal.achex";
		public static final String CARDINAL_PRIVATE_KEY = "privateKey.cardinal";
		public static final String CARDINAL_PUBLIC_KEY = "publicKey.cardinal";

		public static final String DUL_RESPONSE_CODE_PARAM = "responseCode";
		public static final String DUL_RESPONSE_MESSAGE_PARAM = "responseMessage";
		public static final String DUL_REFERENCE_ID_PARAM = "referenceId";
		public static final String DUL_EXCEEDED_FORWARD = "errorExcedded";
		public static final String DUL_ERROR_FORWARD = "DULGeneralError";

		public static final String DUL_RESP_SUCCESS = "dul.resp.success";
		public static final String DUL_RESP_ERR_RETRYLIMIT = "dul.resp.err.retrylimit";
		public static final String DUL_RESP_ERR_INPUT = "dul.resp.err.input";
		public static final String DUL_RESP_ERR_AUTDOCACC = "dul.resp.err.autdocacc";
		public static final String DUL_RESP_ERR_ENC_DOWN = "dul.resp.err.enc.down";
		public static final String DUL_RESP_ERR_ENCRYPTION = "dul.resp.err.encryption";
		public static final String DUL_RESP_ERR_SIGNATURE = "dul.resp.err.signature";
		public static final String DUL_RESP_ERR_GENERAL = "dul.resp.err.general";

		public static final String CARDINAL_URL = "cardinal.request.url";
		public static final String CARDINAL_CIPHERKEY = "cipher.key.cardinal";

		public static final String CARDINAL_MERCHANT_ID = "cardinal.merchantId";
		public static final String CARDINAL_CLEAR_ID = "cardinal.clearId";
		public static final String AMOUNT_FORMAT = "amount.format";

		public static final String MESSAGEPANEL_INFO = "mplInfo";
		public static final String MESSAGEPANEL_ERROR = "mplError";

		public static final String CHANNEL_PAYMENT_INSTRUMENT_DATE_FORMAT = "MM/yyyy";

		public static final String PASSWORD_PATTERN = "^([0-9a-zA-Z`~@#%^&*\\(\\)-_=+\\[\\]{}\\|;:'\",.<>/?!$]*)((?=.{8,16})(((?=.*[0-9])(((?=.*[a-z])(?=.*[A-Z]))|(?=.*[`~@#%^&*\\(\\)-_=+\\[\\]{}\\|;:'\",.<>/?!$])))|((?=.*[`~@#%^&*\\(\\)-_=+\\[\\]{}\\|;:'\",.<>/?!$])((?=.*[0-9])|((?=.*[a-z])(?=.*[A-Z]))))|(((?=.*[a-z])(?=.*[A-Z]))((?=.*[`~@#%^&*\\(\\)-_=+\\[\\]{}\\|;:'\",.<>/?!$])|(?=.*[0-9])))))([0-9a-zA-Z`~@#%^&*\\(\\)-_=+\\[\\]{}\\|;:'\",.<>/?!$]*)$";

		public static final String SEND_MONEY_CORR_FACILITY = "send_money_corr_facility";
		public static final String CONTACT_DESTINATION_COUNTRY_ISO_CODE = "contact_destination_country_iso_code";
		public static final String PAGE_NOTIFICATION = "page_notification";
		public static final String CONTACT = "Contact";
		public static final String PROFILE = "Profile";
		public static final String ANSWER1 = "answer1";
		public static final String ANSWER2 = "answer2";
		public static final String ANSWER3 = "answer3";
		public static final String SECURITY_QUESTION1 = "security-question1";
		public static final String SECURITY_QUESTION2 = "security-question2";
		public static final String SECURITY_QUESTION3 = "security-question3";
		public static final String YES = "yes";
		public static final String NO = "no";
		public static final String TRUE = "true";
		public static final String FALSE = "false";
		public static final String KYC_UPLOAD_ID = "kyc_upload_id";
		public static final String IN_PROGRESS = "IN_PROGRESS";
		public static final String KYCOPTION = "kycOption";
		public static final String MTCN = "mtcn";
		public static final String CONTACT_FILTER = "contact_filter";
		public static final String CONTACTS_HEADER = "contacts_header";
		public static final String MAINFRAME_CONTACTS_HEADER = "mainframe_contacts_header";
		public static final String EMAIL = "email";
		public static final String COUNTRY_ISO_CODE = "country_iso_code";
		public static final String LANGUAGE_ISO_CODE = "language_iso_code";
		public static final String STATE = "state";
		public static final String CITY = "city";
		public static final String PHONE_NUMBER = "sender_phone_number";
		public static final String MOBILE_NUMBER = "mobile_number";
		public static final String MOBILE_NUMBER_DD_CC = "mobile_number_dd_cc";
		public static final String BILLING_CITY = "billing_city";
		public static final String BILLING_STATE = "billing_state";
		public static final String STATELIST_COUNTRY_CODE = "statelist_country_code";
		public static final String CARD_ID = "card_id";
		public static final String CARD_TYPE = "card_type";
		public static final String CONTACT_ID = "contact_id";
		public static final String CONTACT_EMAIL = "contact_email";
		public static final String BANK_STATE = "bank_state";
		public static final String DESTINATION_COUNTRY_ISO_CODE = "destination_country_iso_code";
		public static final String QUICK_COLLECT_LIMIT = "quick_collect_limit";
		public static final String LOGIN_PASSWORD = "login_password";
		public static final String LOGIN_CRUISE_PASSWORD = "login_cruise_password"; // added for cruise
																// login flow
																// password
		public static final String PASSWORD = "password";
		public static final String DATE_OF_BIRTH = "date_of_birth";
		public static final String PHONE_NUMBER_DD_CC = "phone_number_dd_cc";
		public static final String CONTACT_PHONE_NUMBER = "contact_phone_number";
		public static final String CONTACT_MOBILE_NUMBER = "contact_mobile_number";
		public static final String BUSINESS_NAME = "business_name";
		public static final String BILLER_NAME = "biller_name";
		public static final String TRACK_DESTINATION_COUNTRY_ISO_CODE = "track_destination_country_iso_code";
		public static final String CONVERSION_AMOUNT_CURRENCY = "conversion_principal_amount_currency";
		public static final String CONVERSION_CURRENCY = "conversion_currency";
		public static final String PROGRESS_INDICATOR = "progress_indicator";
		public static final String TRANSACTION_MESSAGE = "transaction_message";
		public static final String SENDER_FIRST_NAME = "sender_first_name";
		public static final String SENDER_LAST_NAME = "sender_last_name";
		public static final String RECEIVER_FIRST_NAME = "receiver_first_name";
		public static final String RECEIVER_LAST_NAME = "receiver_last_name";
		public static final String TRANSFERAMOUNT = "transfer_amount";
		public static final String TRACK_DATE_MONTH = "date_sent_month";
		public static final String TRACK_DATE_DAY = "date_sent_day";
		public static final String TRACK_DATE_YEAR = "date_sent_year";
		public static final String TRACK_DATE_SENT = "date_sent";
		public static final String PENDINGKYCFLOW = "pendingKYCFlow";
		public static final String TRANSACTIONSTATUS = "transactionStatus";
		public static final String BILLPAY = "bill-pay";
		public static final String SENDMONEY = "send-money";
		public static final String FLOWURL = "flowUrl";
		public static final String SENDINMATE = "send-inmate";
		public static final String DASHBOARD = "dashboard";
		public static final String EDIT_CONTACT = "edit-contact";
		public static final String PAGE = "page";
		public static final String LIGHTBOX_LAUNCHER = " lightbox-launcher";
		public static final String PAYMENT_TYPE = "payment_type";
		public static final String SERVICE_UID = "service.uid";
		public static final String ACCOUNT_NBR = "account_nbr";
		public static final String TRANSACTION_ID = "transaction_id";
		public static final String CURRENCY_ISO_CODE = "currency_iso_code";
		public static final String PROGRESS = "progress";
		public static final String COMPLETED = "completed";
		public static final String REDIRECTTOPROFILE = "redirectToprofile";
		public static final String LOGIN = "login";
		public static final String BNK_TXN_DECLINE = "C1997";
		public static final String BLZ_TXN_DECLINE = "C1974";
		public static final String GEN_BNK_DECLINE = "C2016";
		public static final String AMT_BNK_DECLINE = "C2010";
		public static final String PMT_BNK_DECLINE = "C2011";
		public static final String LANGUAGE = "language";
		public static final String COUNTRY = "country";
		public static final String PROVIDER_ID = "providerId";
		public static final String EMP_ID = "empId";
		public static final String CLIENT_ID = "clientId";
		public static final String TIME_STAMP = "timeStamp";
		public static final String SHARED_SECRET = "sharedSecret";
		public static final String COMMA = ",";
		public static final String EQUALS = "=";
		public static final String PARAMETER_MISSING = "prmMissing";
		public static final String USER_NAME = "userName";
		public static final String CRUISE = "cruiselogout";
		public static final String FIRST_CRUISE_HIT = "firstHit";

	}


