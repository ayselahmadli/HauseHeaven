package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import java.util.List;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    /*============ Admin Login Sayfası  ================*/

    @FindBy(xpath = "//input[@name=\"username\"]")
    public WebElement adminEmailButton; //Admin login sayfasındaki email kutusu
    @FindBy(xpath = "//input[@name=\"password\"]")
    public WebElement adminPasswordButton; //Admin login sayfasındaki password kutusu
    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement adminSignInButton; //Admin login sayfasındaki SIGN IN butonu

    /*========= Sign In  -  Sign Up   Bolumleri  ===============*/

    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement emailUsernameButton; // login sayfasi Email/Username botonu
    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement emailPasswordButton; // login sayfasi Password botonu
    @FindBy(xpath = "//a[@class='link']")
    public WebElement parolaUnutmaButonu; // Forgot Your Password elementi
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement loginButonu; // user login buton elementi
    @FindBy(xpath = "//a[@href=\"#\"]")
    public WebElement logoutButon;
    /*====================================================*/
    //Dashboard kisminin Locate'leri

    @FindBy(xpath = "//li[@class=\"breadcrumb-item active\"]")
    public WebElement adminDashboardSayfaTitle;
    @FindBy(xpath = " //span[@class=\"username d-none d-sm-inline\"]")
    public WebElement adminAdSoyadAdminTest;
    @FindBy(xpath = "(//div[@class=\"col\"])[1]")   //Active properties tiklamak için
    public WebElement activePropertiesClick;
    @FindBy(xpath = "(//div[@class=\"col\"])[2]")   //Pending properties tiklamak için
    public WebElement pendingPropertiesClick;
    @FindBy(xpath = "(//div[@class=\"col\"])[3]")   //Expired properties tiklamak için
    public WebElement expiredPropertiesClick;
    @FindBy(xpath = "(//div[@class=\"col\"])[4]")   //Agents tiklamak için
    public WebElement agentsClick;
    @FindBy(xpath = "//a[@class=\"btn-logout\"]")
    public WebElement adminLogout;

    //********************  ADMİN MEDİA *****************************

    @FindBy(xpath = "//a[@href=\"https://qa.hauseheaven.com/admin/media\"]")
    public WebElement adminMediaButton;  //Dashboard alti
    @FindBy(xpath = "//button[@class=\"btn btn-success js-dropzone-upload dz-clickable\"]")
    public WebElement adminUploadButton; //Admin/Media işlem butonları
    @FindBy(xpath = "//button[@class=\"btn btn-success js-download-action\"]")
    public WebElement adminDownloadButton; //Admin/Media işlem butonları

    //-----------------------Dowload içeriği----------------------------
    @FindBy(xpath = "//textarea[@name=\"urls\"]")
    public WebElement adminDowloadTextarea; // link eklenecek alan
    @FindBy(xpath = "//button[text()='Download']")
    public WebElement adminDowloadMediaDownload; // link eklendikten sonraki buton
    @FindBy(xpath = "//button[@class=\"btn btn-success js-create-folder-action\"]")
    public WebElement adminCreateFolderButton; //Admin/Media işlem butonları

    //----------------------Create Folder içeriği -------------------------
    @FindBy(xpath = "//input[@placeholder=\"Folder name\"]")
    public WebElement adminCreateFolderNameBox; // Create Folder dan sonrası
    @FindBy(xpath = "//button[text()='Create']")
    public WebElement adminCreateFolderNameBoxCreateButton; // Create Folder dan sonrası

    //===============FILTER ICERİK ===========================
    @FindBy(xpath = "//button[@class=\"btn btn-success dropdown-toggle js-rv-media-change-filter-group js-filter-by-type\"]")
    public WebElement adminMediaFilterButton; //Admin/Media işlem butonları(JavaScript)
    @FindBy(xpath = "//button[@class=\"btn btn-success dropdown-toggle js-rv-media-change-filter-group js-filter-by-view-in\"]")
    public WebElement adminViewInAllMediaButton; //Admin/Media işlem butonları(JavaScript)
    @FindBy(xpath = "//input[@placeholder=\"Search in current folder\"]")
    public WebElement adminMediaSearchBox;
    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement getAdminMediaSearchBoxButton;
    @FindBy(xpath = "//div[@class=\"rv-media-grid\"]")
    public WebElement adminMediaFilterEverythingTeam4;
    @FindBy(xpath = "//div[@title=\"TEAM4\"]")
    public WebElement adminMediaFolderTEAM4;
    @FindBy(xpath = "//div[text()='Success']")
    public WebElement adminMediaDownloadSuccessMessage;
    @FindBy(xpath = "(//i[@class=\"fa fa-file-video\"])[2]")
    public WebElement videoFilter;
    @FindBy(xpath = "//a[@data-value=\"trash\"]")
    public WebElement trashView;
    @FindBy(xpath = "//div[@class=\"rv-media-breadcrumb\"]")
    public WebElement trashTitle;
    @FindBy(xpath = "(//a[@data-value=\"recent\"])[2]")
    public WebElement recentView;
    @FindBy(xpath = "//div[@class=\"rv-media-bottom-header\"]")
    public WebElement recentTitle;
    @FindBy(xpath = "(//a[@data-value=\"document\"])[2]")
    public WebElement documentFilter;
    @FindBy(xpath = "(//a[@href=\"https://qa.hauseheaven.com/admin\"])[3]")
    public WebElement adminHome;

    //==============================================================

    /**************  HEADER BÖLÜMÜ  **************/

    @FindBy(xpath = "//a[@href=\"https://qa.hauseheaven.com/\"]")
    public WebElement homeLinki;  // Header kısmındaki Home butonu
    @FindBy(xpath = "//a[@href=\"https://qa.hauseheaven.com/properties?layout=sidebar\"]")
    public WebElement listingLinki; // Header kısmındaki Listing butonu
    @FindBy(xpath = "//a[@href=\"https://qa.hauseheaven.com/projects\"]")
    public WebElement projectsLinki; // Header kısmındaki Projects butonu
    @FindBy(xpath = "//a[@href=\"https://qa.hauseheaven.com/agents\"]")
    public WebElement agentsLinki; // Header kısmındaki Agents butonu
    @FindBy(xpath = "//a[@href=\"https://qa.hauseheaven.com/blog\"]")
    public WebElement blogLinki; // Header kısmındaki Blog butonu
    @FindBy(xpath = "//a[@href=\"https://qa.hauseheaven.com/contact\"]")
    public WebElement contactLinki; // Header kısmındaki Contact butonu
    @FindBy(xpath = "(//a[@href=\"https://qa.hauseheaven.com/login\"])[1]")
    public WebElement signUpLinki; // Header kısmındaki Sign Up butonu
    @FindBy(xpath = "//a[@href=\"https://qa.hauseheaven.com/account/properties/create\"]")
    public WebElement addPropertyLinki; // Header kısmındaki Add Property butonu
    @FindBy(xpath = "//a[@href=\"https://qa.hauseheaven.com/login\"]")
    public WebElement SignInLinki; // Header kısmındaki Sign In butonu
    @FindBy(xpath = "(//a[@href=\"https://qa.hauseheaven.com/login\"])[2]")
    public WebElement signInLinki; // Header kısmındaki Sign In butonu
    @FindBy(xpath = "//a[@href=\"https://qa.hauseheaven.com/wishlist\"]")
    public WebElement wishlistLinki; // Header kısmındaki Wishlist butonu
    @FindBy(xpath = "//a[@href=\"https://qa.hauseheaven.com/account/dashboard\"]")
    public WebElement isimSoyisim; //Header kısmındaki Kullanici isminin olduğu bölüm

    //*****************************************PAYMENT*********************************************************************

    @FindBy(xpath = "//i[@class=\"fas fa-credit-card\"]")
    public WebElement adminPaymentButton; //Admin sayfasındaki payment menu butonu.
    @FindBy(xpath = "(//a[@href=\"https://qa.hauseheaven.com/admin/payments/transactions\"])[2]")
    public WebElement adminPaymentTransactionsButton; //Paymentin altindaki Transactions menusu
    @FindBy(xpath = "//button[@class=\"btn btn-primary btn-apply\"]")
    public WebElement adminPaymentFilterApplyButton; //payment filter deki apply butonu
    @FindBy(xpath = "//input[@class=\"form-control input-sm\"]")
    public WebElement adminPaymentSearchBox; //Payment deki search box elementi
    @FindBy(xpath = "//button[@class=\"btn btn-secondary buttons-reload\"]")
    public WebElement adminPaymentReloadButton; //Payment sayfasındaki reload butonu
    @FindBy(xpath = "(//div[@class=\"checkbox checkbox-primary table-checkbox\"])[1]")
    public WebElement adminPaymentCheckBox; //NOT:alt satirdaki check boxlar kullanılmak isteniyorsa
    // köşeli parantez içine satır no sunu yazarak uygulayabilirsiniz
    @FindBy(xpath = "//span[@class=\"badge bg-secondary bold badge-dt\"]")
    public WebElement adminPaymentRecortsNum; //sayfanın sonundaki recorts sayısını gosteren alan
    @FindBy(xpath = "//select[@name=\"botble-payment-tables-payment-table_length\"]")
    public WebElement adminPaymentRecortNumFilter;
    @FindBy(xpath = "//a[text()='« Previous']")
    public WebElement adminPaymentPreviousButton;
    @FindBy(xpath = "//a[text()='Next »']")
    public WebElement adminPaymentNextButton;
    @FindBy(xpath = "(//a[@href=\"#\"])[1]")
    public WebElement adminPaymentPageNumber1Button;
    @FindBy(xpath = "(//a[@href=\"#\"])[2]")
    public WebElement adminPaymentPageNumber2Button;
    @FindBy(xpath = "(//a[@href=\"#\"])[3]")
    public WebElement adminPaymentPageNumber3Button;
    @FindBy(xpath = "//div[@class=\"portlet-body\"]")
    public WebElement adminPaymentTumIslemTablosu;

    //****************************************FILTERS***********************************************

    @FindBy(xpath = "//button[@class=\"btn btn-primary btn-show-table-options\"]")
    public WebElement adminPaymentFiltersButton; //Paymetdeki filters butonu
    @FindBy(xpath = "(//select[@class=\"ui-select filter-column-key\"])[2]")
    public WebElement adminPaymentFilterSelect_filedButton; //Payment deki filters butonuna basinca acilan select filed butonu
    @FindBy(xpath = "//select[@class=\"ui-select filter-column-operator\"]")
    public  WebElement adminPaymentFiltersIsEqualsToButton; //Payment deki filters butonuna basinca acilan is equals to butonu
    @FindBy(xpath = "//select[@class=\"form-control input-value filter-column-value select ui-select\"]")
    public WebElement adminPaymentFiltersSelectOptionButton; //Payment deki filters butonuna basinca acilan value butonu

    //=================================== Listing ===================================================
    @FindBy(xpath = "//input[@name=\"k\"]")
    public WebElement listingPageSearchTextBox;

    //****************************User Dashboard**************************************************
    @FindBy(xpath = "(//a[@href=\"https://qa.hauseheaven.com/account/dashboard\"])[2]")
    public WebElement userDashboard; // Dashboard kullanıcı girişi elementi

//****************************  Settings  **************************************************

    @FindBy(xpath = "//*[@title=\"Settings\"]")
    public WebElement userSettings;// Dashboard un altındaki Settings elementi
    @FindBy(xpath = "//*[@name='first_name']")
    public WebElement userSettingsFirstName;// User Sayfası Settings/FirstName elementi
    @FindBy(xpath = "//*[@name='last_name']")
    public WebElement userSettingLastName;// User Sayfası Settings/LastName elementi
    @FindBy(xpath = "//*[@name='username']")
    public WebElement userSettingsUserName;// User Sayfası Settings/UserName elementi
    @FindBy(xpath = "//*[@name=\"phone\"]")
    public WebElement userSettingsPhone;// User Sayfası Settings/Phone elementi
    @FindBy(id = "description")
    public WebElement userSettingsShortDescription;// User Sayfası Settings/ Short Description elementi
    @FindBy(id = "id=\"email\"")
    public WebElement userSettingsEmail;// User Sayfası Settings/Email elementi
    @FindBy(xpath = "//*[@name=\"year\"]")
    public WebElement userSettingsBirthdayYear;// User Sayfası Settings/Birthday
    @FindBy(xpath = "//*[@name=\"month\"]")
    public WebElement userSettingsBirthdayMonth;// User Sayfası Settings/Birthday
    @FindBy(xpath = "//*[@name=\"day\"]")
    public WebElement userSettingsBirthdayDay;// User Sayfası Settings/Birthday
    @FindBy(id = "gender")
    public WebElement userSettingsGender;// user Sayfası Settings tıklandıktan sonra gelen  Gender elementi
    @FindBy(xpath = "//*[@class='btn btn-primary fw6']")
    public WebElement userSettingsSave;// User sayfası Settings tıklandıktan sonra gelen Save elementi
    @FindBy(xpath = "//div[@id='alert-container']")
    public WebElement userSettingsUpdateprofileSuccessfully;// profil güncellendi bilgilendirme yazısı

//****************************  Buy Credits  **************************************************

    @FindBy(xpath = "//*[@title=\"credits\"]")
    public WebElement userBuyCredits;// Kayıtlı kullanıcı menülerinden Buy credits elementi
    @FindBy(xpath = "(//button[text()='Purchase'])[1]")
    public WebElement userBuyCreditsFirstPost;

// User girişi Buy Credits tıklandıktan sonra açılan sayfada Transactions elementi

    @FindBy(xpath = "//input[@placeholder=\"Card number\"]")
    public WebElement getUserBuyCreditsCardNumber;// tüm postlar için aynı locate
    @FindBy(xpath = "//input[@placeholder=\"MM/YY\"]")
    public WebElement getUserBuyCreditsCardLastDateMMYY;// tüm postlar için aynı locate
    @FindBy(xpath = "//input[@placeholder=\"CVC\"]")
    public WebElement getUserBuyCreditsCardCVC;// tüm postlar için aynı locate
    @FindBy(xpath = "//input[@placeholder=\"Full name\"]")
    public WebElement getUserBuyCreditsCardFullname;// tüm postlar için aynı locate
    @FindBy(xpath = "//button[text()='Checkout']")
    public WebElement getUserBuyCreditsCheckoutButon;// tüm postlar için aynı locate
    @FindBy(xpath = "//div[@id=\"alert-container\"]")
    public WebElement getUserBuyCreditsAddCreditsSuccessfully;// tüm postlar için aynı locate

//****************************  Security  **************************************************

    @FindBy(xpath = "//a[@href=\"https://qa.hauseheaven.com/account/security\"]")
    public WebElement userSecurity;// Kayıtlı kullanıcı menülerinden Security
    @FindBy(xpath = "//input[@name=\"password\"]")
    public WebElement UserSecurityNewPassword;// Kayıtlı kullanıcı menülerinden Security/New password
    @FindBy(xpath = "//input[@name='password_confirmation']")
    public WebElement UserSecurityConfirmationPassword;// Kayıtlı kullanıcı menülerinden Security/Confirmation password
    @FindBy(xpath = "//*[@class=\"btn btn-theme-light-2\"]")
    public WebElement UserSecurityUpdatePassword;// Kayıtlı kullanıcı menülerinden Security bölümü Update password elementi
    @FindBy(xpath = "//div[@id=\"alert-container\"]")
    public WebElement UserSecurityPasswordSuccesfullyChanged;

    //*************************************************************************************************
    //************************************ Gizem Hanım *************************************************

    ///====================================ADMINDASHBOARDPAGE===============///
    @FindBy(xpath = "//*[@id=\"cms-core-dashboard\"]")   //Dashboard tiklamak için
    public WebElement dashboardClick;

    @FindBy(xpath = "//span[@class=\"username d-none d-sm-inline\"]")
    public WebElement adminTestIsim;

    @FindBy(xpath = "//a[@href=\"https://qa.hauseheaven.com/admin/logout\"]")
    public WebElement adminLogoutNew;


    ///==================ADMINREALSTATE==================//

    @FindBy(xpath = "//i [@class='fa fa-bed']")
    public WebElement realEstateButonu;     //Admin sayfasındaki  "Real Estate" butonu
    @FindBy(xpath = "//input[@class='form-control input-sm']")
    public WebElement searchElementi;       //Real Estate butonu altındaki "properties" altındaki Search Elementi
    @FindBy(xpath = "//a[@href='https://qa.hauseheaven.com/admin/real-estate/facilities']")
    public WebElement adminfacilitiesbutton;
    @FindBy(xpath = "//span[@class=\"badge bg-secondary bold badge-dt\"]")
    public WebElement adminfacilitiessayisi;
    @FindBy(xpath = "//span[@data-href=\"https://qa.hauseheaven.com/admin/real-estate/facilities/create\"]")
    public WebElement adminFacilitiesCreate;
    @FindBy(xpath = "//input[@placeholder=\"Name\"]")
    public WebElement adminFacilitiesCreateName;
    @FindBy(xpath = "(//span[@class=\"select2-selection__rendered\"])[1]")
    public WebElement adminFacilitiesCreateIcon;
    @FindBy(xpath ="(//li[@class=\"select2-results__option select2-results__option--selectable\"])[3]")
    public WebElement adminFacilitiesCreateIconInstagram;  //bu secenekler sirasiyla gitmektedir
    @FindBy(xpath = "(//button[@class=\"btn btn-info\"])[1]")
    public WebElement adminFacilitiesCreateSaveExit;
    @FindBy(xpath = "(//a[@class=\"btn btn-icon btn-sm btn-primary\"])[1]")
    public WebElement adminFacilitiesEdit;// 1 den 10 dogru sirasiyla gitmektedir
    @FindBy(xpath = "//button[@class=\"float-end btn btn-danger delete-crud-entry\"]")
    public WebElement adminFacilitiesTrashDelete;
    @FindBy(xpath = "//button[@class=\"btn btn-primary btn-show-table-options\"]")
    public  WebElement adminFacilitiesFilters;
    @FindBy(xpath = "//a[@class=\"btn btn-secondary add-more-filter\"]")
    public WebElement adminFacilitiesFiltersAddfilter;
    @FindBy(xpath = "(//select[@name=\"filter_columns[]\"])[2]")
    public  WebElement adminFacilitiesFiltersSelectFieldup; // dropdown ozelligi mevcut
    @FindBy(xpath = "(//select[@name=\"filter_columns[]\"])[3]")
    public  WebElement adminFacilitiesFiltersSelectFielddown; // dropdown ozelligi mevcut
    @FindBy(xpath = "(//select[@name=\"filter_operators[]\"])[2]")
    public  WebElement adminFacilitiesFiltersIsequals;
    @FindBy(xpath = "(//select[@name=\"filter_operators[]\"])[3]")
    public  WebElement adminFacilitiesFiltersContains;
    @FindBy(xpath = "//input[@class=\"form-control input-value filter-column-value\"]")
    public  WebElement adminFacilitiesFiltersValueup;
    @FindBy(xpath = "//button[@class=\"btn btn-primary btn-apply\"]")
    public  WebElement adminFacilitiesFiltersApply;
    @FindBy(xpath = "(//a[@href=\"https://qa.hauseheaven.com/admin/real-estate/facilities/edit/89\"])[1]")
    public WebElement filtrenenFacilitiesigoruntuleme;
    @FindBy(xpath = "//a[@class=\"btn btn-icon btn-sm btn-danger deleteDialog\"]")
    public WebElement facilitiesTrash;
    @FindBy(xpath = "//div[text()=\"Success!\"]")
    public WebElement facilitiesDeleteSucces;

    //=====================BASEPAGE ============//
    @FindBy(xpath = "//footer[@class=\"dark-footer skin-dark-footer\"]")
    public WebElement footerTumOgeler; //Footer bölümünün tamamı
    @FindBy(xpath = "(//div[@class='footer-widget'])[1]")
    public WebElement iletisimBilgileri; // Footer kısmındaki en solda bulunan iletişim bilgileri
    @FindBy(xpath = "(//div[@class='footer-widget'])[2]")
    public WebElement aboutDiv; // Footer kısmındaki About ve alt başlıkları
    @FindBy(xpath = "(//div[@class='footer-widget'])[3]")
    public WebElement moreInformationDiv; // Footer kısmındaki More Information ve alt başlıkları
    @FindBy(xpath = "(//div[@class='footer-widget'])[4]")
    public WebElement newsDiv; // Footer kısmındaki News ve alt başlıkları
    @FindBy(xpath = "//div[@class='col-lg-3 col-md-6']")
    public WebElement dowloadAppsDiv; // Footer kısmındaki Dowload Apps ve alt başlıkları
    @FindBy(xpath = "//span[text()='About us']")
    public WebElement aboutUsLinki; // Footer/About kısmındaki About us linki
    @FindBy(xpath = "//span[text()='Terms & Conditions']")
    public WebElement termsConditionsLinki; // Footer/About kısmındaki Terms & Conditions linki
    @FindBy(xpath = "//span[text()='All properties']")
    public WebElement allPropertiesLinki; // Footer/MORE INFORMATION kısmındaki All properties linki
    @FindBy(xpath = "//span[text()='Houses for sale']")
    public WebElement housesForSaleLinki; // Footer/MORE INFORMATION kısmındaki Houses for sale linki
    @FindBy(xpath = "//span[text()='Houses for rent']")
    public WebElement housesForRentLinki; // Footer/MORE INFORMATION kısmındaki Houses for rent linki
    @FindBy(xpath = "//span[text()='The Benefits Of Investing In Emerging Real Estate Markets']")
    public WebElement theBenefitsOfLinki; // Footer/NEWS kısmındaki The Benefits Of Investing In Emerging Real Estate Markets linki
    @FindBy(xpath = "//span[text()='A Guide To Negotiating The Best Deal On Your Dream Home']")
    public WebElement aGuideToNegotiatingLinki; // Footer/NEWS kısmındaki A Guide To Negotiating The Best Deal On Your Dream Home linki
    @FindBy(xpath = "//span[text()='The Rise Of Sustainable Homes: Building For A Greener Future']")
    public WebElement theRiseOfSustainableLinki; // Footer/NEWS kısmındaki The Rise Of Sustainable Homes: Building For A Greener Future linki
    @FindBy(xpath = "//span[text()='How to Stage Your Home for a Quick and Profitable Sale']")
    public WebElement howToStageYourHomeLinki; // Footer/NEWS kısmındaki How to Stage Your Home for a Quick and Profitable Sale linki
    @FindBy(xpath = "//span[text()='Investing in Vacation Rental Properties: A Lucrative Opportunity']")
    public WebElement investingInVacationLinki; // Footer/NEWS kısmındaki Investing in Vacation Rental Properties: A Lucrative Opportunity linki
    @FindBy(xpath = "(//a[@href=\"https://www.apple.com/app-store/\"])[4]")
    public WebElement appStoreLinki; // Footer/Download Apps kısmındaki App Store linki
    @FindBy(xpath = "//input[@placeholder=\"Enter your email\"]")
    public WebElement emailKutusuSubscribe; // Footer/Subscribe kısmındaki email kutusu
    @FindBy(xpath = "//button[text()='Subscribe']")
    public WebElement SubscribeButonu; // Footer/Subscribe kısmındaki Subscribe butonu
    @FindBy(xpath = "(//a[@href=\"https://consumer.huawei.com/tr/mobileservices/appgallery/\"])[2]")
    public WebElement googleplayNew;

    //======================PROJECTS  LOCATE===================//

    @FindBy(xpath = "(//span[@class=\"select2-selection select2-selection--single\"])[1]")
    public WebElement countryButonu;  //Projects sayfası filtreleme Country butonu
    @FindBy(xpath = "//button[text()='Search']")
    public WebElement searchButonu;  //Projects sayfası filtreleme search butonu
    @FindBy(xpath = "(//h4)[1]")
    public WebElement projectsResultNumber;// Projects sayfası ilan sonuç sayısı
    @FindBy(xpath = "(//div[@class=\"row\"])[3]")
    public WebElement projectsSayfadakiTumIlanlar;// Projects sayfası tüm ilanlar
    @FindBy(xpath = "//button[@class=\"js-cookie-consent-agree cookie-consent__agree\"]")
    public WebElement projeCookies;
    @FindBy(xpath = "//span[@title=\"Category\"]")
    public WebElement projeCategoryNew;
    @FindBy(xpath = "(//li[@role=\"option\"])[4]")
    public WebElement projeCategoryHouseNew;

    //=====================USERDASHBOARD================///

// Kayıtlı kullanıcı menülerinden Buy credits elementi

    @FindBy(xpath = "//*[@title=\"Properties\"]")
    public WebElement userProperties;// Kayıtlı kullanıcı menülerinden Properties
    @FindBy(xpath = "//*[@class='form-control input-sm'][1]")
    public WebElement userPropertiesSearch;// User girişi Buy credits tıklayınca açılan sayfadaki Search elementi
    @FindBy(xpath = "//*[@id=\"name\"]")   //Title yazmak için
    public WebElement titleClick;
    @FindBy(xpath = "//*[@id=\"description\"]")   //Description yazmak için
    public WebElement descriptionClick;
    @FindBy(xpath = "//*[@id=\"location\"]")   //Property location yazmak için
    public WebElement propertyLocationClick;
    @FindBy(xpath = "//*[@id=\"latitude\"]")   //Latitude yazmak için
    public WebElement latitudeClick;
    @FindBy(xpath = "//*[@id=\"longitude\"]")   //Longitude yazmak için
    public WebElement longitudeClick;
    @FindBy(xpath = "//*[@id=\"number_bedroom\"]")   //Number bedrooms tıklamak için
    public WebElement numberBedroomsClick;
    @FindBy(xpath = "//*[@id=\"number_bathroom\"]")   //Number bathrooms tıklamak için
    public WebElement numberBathroomsClick;
    @FindBy(xpath = "//*[@id=\"number_floor\"]")   //Number floors tıklamak için
    public WebElement numberFloorsClick;
    @FindBy(xpath = "//*[@id=\"square\"]")   //Squares tıklamak için
    public WebElement squaresClick;
    @FindBy(xpath = "//*[@id=\"price-number\"]")   //Price tıklamak için
    public WebElement priceClick;
    @FindBy(xpath = "//*[@id=\"select2-currency_id-container\"]")   //USD tıklamak için
    public WebElement usdClick;
    @FindBy(xpath = "//*[@id=\"label\"]")   //Property label tıklamak için
    public WebElement propertyLabelClick;
    @FindBy(xpath = "//*[@id=\"type_id\"]")   //Type tıklamak için(dropdown)
    public WebElement typeClick;
    @FindBy(xpath = "//button[@value=\"save\"]")   //Save and Exit tiklamak için
    public WebElement saveAndExitClick;
    @FindBy(xpath = "//button[@class='js-cookie-consent-agree cookie-consent__agree']")
    public WebElement usercookies;
    @FindBy(xpath = "//i[@class=\"fas fa-user\"]")
    public WebElement userbutton;
    @FindBy(xpath = "//a[@class=\"btn btn-icon btn-sm btn-danger deleteDialog\"]")
    public WebElement useraddpropertiesTrash;
    @FindBy(xpath = "//input[@placeholder='Card number']")
    public WebElement usercardNumber; // !! sonradan eklendi
    @FindBy(xpath = "//input[@placeholder='Full name']")
    public WebElement usercardfullname; //!! sonradan eklendi
    @FindBy(xpath = "//input[@placeholder='MM/YY']")
    public WebElement usercardmmyy; //!! sonradan eklendi
    @FindBy(xpath = "//button[@class='payment-checkout-btn btn btn-info']")
    public WebElement userCheckout;
    @FindBy(xpath = "//*[@class='btn btn-primary mt-2'][1]")
    public WebElement userBuyCreditsFreeFirstPosttt; //  var ama o calismadi bu yeni locate
    @FindBy(xpath = "//input[@id=\"stripe-cvc\"]")
    public WebElement userbuyCreditsCvc; // digeri calismadii
    @FindBy(xpath = "//a[@data-bs-original-title=\"Edit\"]")
    public  WebElement useraddpropertiesEditNew;   //kendi ekledigim ilanin edit locati
    @FindBy(xpath = " //div[@aria-label=\"Editor editing area: main\"]")
    public WebElement contentClickNew;
    @FindBy(xpath = "(//span[@class=\"select2-selection__rendered\"])[1]")
    public WebElement cityElementi;
    @FindBy(xpath = "//div[@class=\"alert alert-success alert-dismissible\"]")
    public WebElement editsuccess;
    @FindBy(xpath = "//button[@class=\"float-end btn btn-danger delete-crud-entry\"]")
    public WebElement trashComfirmButton;
    @FindBy(xpath = "//td[text()=\"No record\"]")
    public WebElement addPropertiesNoRecord;
    @FindBy(xpath = "//button[@class=\"btn btn-primary mt-2\"]")
    public WebElement buycreditspost;
    @FindBy(xpath = "//a[@href='https://qa.hauseheaven.com/projects']")
    public WebElement projeButtonNev;
    @FindBy(xpath = "(//a[@href=\"https://qa.hauseheaven.com/projects/palm-paradise-residences\"])[2]")
    public WebElement projeayrinti1;
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    public WebElement useraddpropertiesSaveexitSuccesNew;
    @FindBy(xpath = "//a[@href=\"https://qa.hauseheaven.com/account/dashboard\"][1]")
    public WebElement userDashboardNew;

    //************************************************************************
    //**************************  MUSTAFA BEY  ************************************


    @FindBy(xpath = "//i[@class=\"fas fa-sign-out-alt mr1\"]")
    public WebElement userLogout;
// Kayıtlı kullanıcı menülerinden Logout

    //--------------User Dashboard Elementleri -----------------

    @FindBy(xpath = "(//*[@href='https://qa.hauseheaven.com/login'])[2]")
    public WebElement signInButonu;
    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement firstNameKutusu; //register a accounta tıkladıktan sonra gelen formdaki firstname alanı
    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement lastnameKutusu;//register a accounta tıkladıktan sonra gelen formdaki firstname alanı
    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameKutusu;//register a accounta tıkladıktan sonra gelen formdaki username alanı
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailKutusu;//register a accounta tıkladıktan sonra gelen formdaki email alanı
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordKutusu;//register a accounta tıkladıktan sonra gelen formdaki password alanı
    @FindBy(xpath = "//input[@id='password-confirm']")
    public WebElement passwordConfirmKutusu;//register a accounta tıkladıktan sonra gelen formdaki password alanı
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement registerButonu;////register a accounta tıkladıktan sonra gelen formdaki register alanı
    @FindBy(xpath = "(//li[@class='login-item'])[1]")
    public WebElement hesapSahibiAdiElementi;//hesap acıldıktan sonra sag ustte yer alan hesap sahibi adı alanı
    @FindBy(xpath = "//i[@class='fas fa-sign-out-alt']")
    public WebElement logoutButonu;


    /*========= Sign In  -  Sign Up   Bolumleri  ===============*/

    @FindBy(xpath = "(//*[@href='https://qa.hauseheaven.com/login'])[1]") // anasayfa SignUpElementi
    public WebElement signUpMenu;
    @FindBy(xpath = "//*[text()='Register a new account']")
    public WebElement registerNewAccountButonu; // yeni hesap acma butonu
    @FindBy(xpath = "//button[@class='float-end btn btn-danger delete-crud-entry']")         //adminDeleteConfirm
    public WebElement deleteConfirm;


    //HOME PAGE BODY BOLUMU ZIYARETCI-KAYITLI KULLANICI

    //-----------------homePage arama sayfası

    @FindBy(xpath = "//h4[@class='m-0']")
    public WebElement homePageAramaSonuclariElementi;
    @FindBy(xpath = "//button[@class='btn search-btn']")
    public WebElement searchResultButonu;

    //-------Find Accessible Homes To Rent - Arama Kısmı Elementleri---------
    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement homePageSearchLocationInput;//lokasyon olarak// arama yapabilmek icin ilk input elementi
    @FindBy(xpath = "//select[@id='minprice']")
    public WebElement homePageMinPriceSelectKutusu;//minimum fiyat secmek icin 'select' kutusu
    //optionları secmek icin selectByValue(); values :500, 1000, 2000, 5000,10000
    @FindBy(xpath = "//select[@id='maxprice']")
    public WebElement homePageMaxPriceSelectKutusu;//max fiyat secmek icin 'select' kutusu
    //optionları secmek icin  selectByValue(); values :1000, 2000, 5000,10000, 50000

    //------------admin dashboard header bolumu elementleri
    @FindBy(xpath = "//span[@class='d-none d-sm-inline']")
    public WebElement adminDashboardViewWebSiteButonu;
    @FindBy(xpath ="//div[@class='menu-toggler sidebar-toggler']")
    public WebElement adminDashboardizgaraMenu;
    @FindBy(xpath = "//img[@src='https://qa.hauseheaven.com/storage/hausehaven-1.png']")
    public WebElement adminDashboardAnasayfaImage;
    @FindBy(xpath = "//a[@id='open-notification']")
    public WebElement adminDashboardNotificationButonu;
    @FindBy(xpath = "//a[@id='close-notification']")
    public WebElement getAdminDashboardNotificationKapatmaButonu;
    @FindBy(xpath = "(//a[@data-bs-toggle='dropdown'])[2]")
    public WebElement adminDashboardAdminTestButonu;
    @FindBy(xpath = "//a[@href='https://qa.hauseheaven.com/admin/system/users/profile/24']")
    public WebElement adminDashboardAdminTestProfile;
    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement adminDashboardProfileFirstnameKutusu;
    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement adminDashboardProfileLastnameKutusu;
    @FindBy(xpath = "//button[@name='submit']")
    public WebElement adminDashboardAdminTestProfileUpdateButonu;
    @FindBy(xpath = "//a[text()='Change password']")
    public WebElement adminDashboardAdminTestProfileChangePasswordButonu;
    @FindBy(xpath = "//input[@id='old_password']")
    public WebElement adminDashboardAdminTestProfileOldPasswordKutusu;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement adminDashboardAdminTestProfileYeniPasswordKutusu;
    @FindBy(xpath = "//input[@id='password_confirmation']")
    public WebElement adminDashboardAdminTestProfileConfirmPasswordKutusu;
    @FindBy(xpath = "(//button[@class='btn btn-success'])[2]")
    public WebElement adminDashboardAdminTestProfileChangeUpdateButonu;
    @FindBy(tagName = "h1")
    public WebElement adminDashboardAdminTestProfileChangePasswordHataMesaji;
    @FindBy(xpath = "//*[@id=\"cms-plugins-real-estate-account\"]/a/span")
    public WebElement adminAccountButonu;  // Admin sayfasindaki  Accounts butonu
    @FindBy(xpath ="//button[@class='btn btn-primary btn-show-table-options']")
    public WebElement adminAccountFilters; // admin Account sayfasinin Filters bolumu
    @FindBy(xpath = "//*[@class='fas fa-sync']")
    public WebElement adminAccountReload; // admin Account sayfasinin Reload bolumu
    @FindBy(xpath = "//*[@class='dt-length-records']")
    public WebElement adminAccountRecords; //admin Account sayfasinin Reload bolumu
    @FindBy(xpath = "//*[@data-action='create']")
    public WebElement adminAccountCreate; //admin Account sayfasinin Create kutusu
    @FindBy(xpath ="//input[@aria-controls='botble-real-estate-tables-account-table']")
    public WebElement adminAccountSearchButonu; //
    @FindBy(xpath = "//tbody/tr/td")
    public List<WebElement> adminAccountTumhesaplarListesi;
    @FindBy(xpath = "//span[@class='badge bg-secondary bold badge-dt']")
    public WebElement adminAccountSayisiElementi;

    //-------Admin Account Cities---------
    @FindBy(xpath = "//span[@class='badge bg-secondary bold badge-dt']")
    public WebElement adminAccountSehirSayisi;
    @FindBy(xpath = "(//input[@class='checkboxes'])[1]")
    public WebElement adminAccountDeleteCitiesPlusButonu;
    @FindBy(xpath = "(//tbody/tr[2]/td[1]//a)[2]")
    public WebElement adminAccountSehirDeleteButonu;

    //****************** Admin Locations Countries **********************
    @FindBy(xpath = "(//a[@class=\"nav-link nav-toggle\"])[11]") // Admin Dashboard sayfasındaki Locations butonu
    public WebElement adminLocations;//****************** Admin Locations Countries **********************

    //#########################LOCATION\CITIES####################//
    @FindBy(xpath = "//a[@href='https://qa.hauseheaven.com/admin/cities']")
    public WebElement adminLocationCities;
    @FindBy(xpath ="//input[@class='form-control input-sm']")
    public WebElement adminLocationCitiesSeacrhbox;
    @FindBy(xpath ="//button[@class='btn btn-primary btn-show-table-options']")
    public WebElement adminLocationCitiesbutonuFilters;
    @FindBy(xpath = "//a[@class=\"btn btn-secondary dropdown-toggle\"]")
    public WebElement adminLocationCitiesBlunkActionButton; //Location menusu altındaki cities syfasında Blunk Action butonu
    @FindBy(xpath = "//button[@class='btn btn-secondary action-item']")
    public WebElement adminLocationCitiesbutonuCreate;
    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement adminLocationCitiesbutonuCreateNamealani; //admin Account sayfasinin Create butonu first name alani
    @FindBy(xpath = "//input[@placeholder='Slug']")
    public WebElement adminLocationCitiesbutonuCreateSlugalani;
    @FindBy(xpath = "//span[@id='select2-country_id-container']")
    public WebElement adminLocationsCitiesCountrySecmeButonu;
    @FindBy(xpath = "//input[@placeholder='Order by']")
    public WebElement adminLocationCitiesbutonuCreateOrder;
    @FindBy(xpath = "(//*[@class='control-label'])[1]")
    public WebElement adminLocationCitiesbutonuCreateOrderFeatured;
    @FindBy(xpath = "(//button[@class=\"btn btn-info\"])[1]")
    public WebElement adminLOcateCitiesCreateSave_ExitButton; //Create butonu icerisindeki Save&Exit butonu
    @FindBy(xpath = "//tbody/tr[1]/td[9]/div/a[2]")
    public WebElement adminLocationCitiesbutonuDelete;
    @FindBy(xpath = "//button[@class='float-end btn btn-danger delete-crud-entry']")
    public WebElement adminLocationCitiesbutonuDeleteSonraki;
    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement basariliSehirEklemeSilmeMesaji;
    @FindBy(xpath = "//tbody/tr[1]/td[9]/div/a[1]")
    public WebElement adminLocationCitiesbutonuEdit;

    //***************************************************************************
    //*****************************  YASEMİN HANIM  ***********************************

    @FindBy(xpath = "//*[@href=\"https://qa.hauseheaven.com/properties?layout=sidebar\"]")
    public WebElement listingElement;
    @FindBy(xpath = "//*[@class=\"js-cookie-consent-agree cookie-consent__agree\"]")
    public WebElement allowCookiesbutton;
    @FindBy(xpath = "//*[@class='ipt-title']")
    public WebElement listingPropertiesyazisi;     //   *ListingPage
    @FindBy(xpath = "//h4[@class='m-0']")
    public WebElement listingMulkSayisi;
    @FindBy(xpath = "//*[@id=\"clOne\"]")
    public WebElement listingListelenenMulkOzellik1;
    @FindBy(xpath = "//*[@style='font-family: Calibri, sans-serif; font-size: 11pt; line-height: 107%;']")
    public WebElement listingListenenMulkDetails;
    @FindBy(xpath = "//*[@class='btn btn btn-theme-light-2 rounded full-width mt-3']")
    public WebElement listingFindNewHome;
    @FindBy(xpath = "//*[@class='hero-search-wrap']")
    public WebElement homePageBodySearchforLocasyon;
    @FindBy(xpath = "//*[@class='row']")
    public WebElement homePageHowItWorksElements;
    @FindBy(xpath = "//*[@class='ti-angle-right'][1]")
    public WebElement homePageLocasyon;
    @FindBy(xpath = "//*[@title='Category']")
    public WebElement listingPageCategoryElementi;
    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[2]")
    public WebElement listingCategoryApartment;

    //*******************AGENTS********************************

    @FindBy(xpath = "//*[@href='https://qa.hauseheaven.com/agents']") // anasayfa AgentsElementi
    public WebElement agentsMenu;
    @FindBy(xpath = "//h1[text()='All Agents']")
    public WebElement allAgentsGorunurlugu;  // Agents sayfasinda ust barda bulunan All Agents elementi

//****************************AdminRealEstate*************************************

    @FindBy(xpath = "//span[@data-action='create']")
    public WebElement createElementi;       //Real Estate butonu altındaki "properties" altındaki Create Elementi
    @FindBy(xpath = "//*[@href=\"https://qa.hauseheaven.com/admin/real-estate/categories\"][1]")
    public WebElement adminRealEstateCategoriess;
    @FindBy(xpath = "//*[@class='form-control'][1]")
    public WebElement adminRealEstateCategoriesName;
    @FindBy(xpath = "//*[@placeholder='Short description']")
    public WebElement adminRealEstateCategoriesDescription;
    @FindBy(xpath = "//input[@placeholder='Order by']")
    public WebElement adminRealEstateCategoriesOrdertik;
    @FindBy(xpath = "(//button[@value=\"save\"])[1]")
    public WebElement adminCategoriesSave;
    @FindBy(xpath = "//div[@class='page-content ']")
    public WebElement adminCategoriesGorunurluk;
    @FindBy(xpath = "//*[@class='btn btn-icon btn-sm btn-danger deleteDialog'][1]")
    public WebElement adminCategoriesDelete;
    @FindBy(xpath = "//button[@class=\"float-end btn btn-danger delete-crud-entry\"]")
    public WebElement adminCategoriesDeleteOnay;
    @FindBy(xpath = "//*[@class='page-sidebar-closed-hide-logo page-content-white page-container-bg-solid   pace-done']")
    public WebElement adminAlertSuccess;
    @FindBy(xpath = "//*[@class='page-sidebar-closed-hide-logo page-content-white page-container-bg-solid  modal-open pace-done']")
    public WebElement adminDeleteSuccess;

    //**************************************************************************************
    //***************************** ELİF HANIM  *********************************************

    //**************************** blogPages *************************

    @FindBy(xpath = "//h1[@class='ipt-title']")
    public WebElement blogText; //Blog sayfasındaki "Blog" Yazısı  // US_009
    @FindBy(xpath = "//h1[@class=\"ipt-title\"]")    // US_009
    public WebElement blogBlog;
    @FindBy(xpath = "(//img[@class=\"img-fluid thumb lazy entered loaded\"])[1]")      // US_009
    public WebElement blogIlkResim;
    @FindBy(xpath = "(//h4[@class=\"title\"])[1]")   // US_009    // US_024
    public WebElement blogContinueCategories;
    @FindBy(xpath = "(//h4[@Class='title'])[2]")      // US_009            // US_024
    public WebElement recentPosts ;  //Detaylı blog sayfasındaki "Recent Posts" yazısı
    @FindBy(xpath = "//div[@class=\"sidebar_featured_property\"]")       // US_009
    public WebElement FeatureProperties;
    @FindBy(xpath = "//i[@class=\"fab fa-facebook-f\"]")     // US_009          // US_024
    public WebElement blogFacebook;
    @FindBy(xpath = "//i[@class=\"fab fa-linkedin-in\"]")   // US_009               // US_024
    public WebElement blogLinkedin;
    @FindBy(xpath = "//i[@class=\"fab fa-twitter\"]")     // US_009                   // US_024
    public WebElement blogTwitter;
    @FindBy(xpath = "//*[@class=\"post-title\"]")
    public WebElement blogIlkResimAyrinti;          // US_024


    //******************************** HomePges ****************

    @FindBy(xpath = "//input[@class=\"form-control bg-white font-small\"]")
    public WebElement homeSubscribeEmail;
    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement enterSubscrib;
    @FindBy(xpath = "(//input[@class=\"form-control\"])[2]")
    public WebElement passwordAdmin;
    @FindBy(xpath = "//button[@class=\"btn btn-block login-button\"]")
    public WebElement adminGirisSingIn;
    @FindBy(xpath = "(//a[@href=\"https://qa.hauseheaven.com/admin\"])[3]")
    public WebElement dashboardAdmin;

    // **************************  AdminLocationsPages *******************

    @FindBy(xpath = "//i[@class=\"far fa-newspaper\"]")
    public WebElement newsletterAdmin;
    @FindBy(xpath = "//a[@href=\"https://qa.hauseheaven.com/admin/countries\"]")
    public WebElement adminLocationsCountries;
    @FindBy(xpath = "//span[@class=\"badge bg-secondary bold badge-dt\"]")
    public WebElement adminLocationsContriesRecordsSayisi;
    public WebElement adminLocationsCountriesBulkActions;
    @FindBy(xpath = "//button[@class=\"btn btn-primary btn-show-table-options\"]")
    public WebElement adminLocationsCountriesFilters;
    @FindBy(xpath = "//input[@type='search']")
    public WebElement adminLocationsCountriesSearch;
    @FindBy(xpath = "//span[@data-action=\"create\"]")
    public WebElement adminLocationsCountriesCreate;
    @FindBy(xpath = "//i[@class=\"fas fa-sync\"]")
    public WebElement adminLocationsCountriesReload;
    @FindBy(xpath = "//input[@name=\"name\"]")
    public WebElement adminLocationsCountriesCreateName;
    @FindBy(xpath = "//input[@name=\"nationality\"]")
    public WebElement adminLocationsCounriesCreateNationality;
    @FindBy(xpath = "//input[@name=\"code\"]")
    public WebElement adminLocationsCountriesCreateCountryISOcode;
    @FindBy(xpath = "(//button[@type=\"submit\"])[1]")
    public WebElement adminLocationsContriesSaveExit;
    @FindBy(xpath = "(//a[@class=\"btn btn-icon btn-sm btn-danger deleteDialog\"])[1]")
    public WebElement adminLocationsContriesDelete;
    @FindBy(xpath = "//button[@class=\"float-end btn btn-danger delete-crud-entry\"]")
    public WebElement adminLocationsContriesDeleteikinci;
    @FindBy(xpath = "//div[text()='Deleted successfully']")
    public WebElement CountriesDeleteSon;

    // ************************  AdminNewsletterPages ************

    @FindBy (xpath = "//button[@class=\"btn btn-primary btn-show-table-options\"]")
    public WebElement newsletterFiltersButton;
    @FindBy (xpath = "//input[@type='search']")
    public WebElement searchButton;    // Newsletters sayfasinda search butonu
    @FindBy (xpath = "//span[@class='caret']")
    public WebElement exportButton;    // Newsletters sayfasinda export butonu
    @FindBy (xpath = "//span[text()=' Reload']")   // Reload kelimesinden once bir bosluk oldugunda lokate aldi
    public WebElement reloadButton;    // Newsletters sayfasinda Reload butonu
    @FindBy(xpath = "//a[text()='Next »']")
    public WebElement nextButton; //Newsletter sayfasinda filtreleme 10 olunca next calisir
    @FindBy(xpath = "(//a[@class=\"btn btn-icon btn-sm btn-primary\"])[1]")
    public WebElement adminLocationsCountriesEdit;

    //**************************************************************************
    //**********************  AYSE HANIM  **************************************

    @FindBy(xpath = "//h1[@class='ipt-title']")
    public WebElement contactSayfasiBaslik;
    // Sayfanın  en ustunde buyuk CONTACT seklindeki baslik
    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameMetinKutusu;
    // Isim girilecek alan
    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailMetinKutusu;
    // E-mail girilecek alan
    @FindBy(xpath = "//input[@name='subject']")
    public WebElement subjectMetinKutusu;
    // Konu girilecek alan
    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phoneMetinKutusu;
    // Telefon numarası girilecek alan
    @FindBy(xpath = "//textarea[@name='content']")
    public WebElement messageMetinKutusu;
    // Mesaj metni eklenecek alan
    @FindBy(xpath = "//button[text()='Send message']")
    public WebElement sendMessageButonu;
    // Mesaj gönderme butonu
    @FindBy(xpath = "(//div[@class='cn-info-content'])[1]")
    public WebElement reachUsAdresAlani;
    // Sag tarafta iletisim bilgilerinin oldugu yerde Reach Us bolumunun tamamini aliyor
    // Reach Us seklindeki basligi ve alttaki adres seklindeki metni tam olarak ayiramiyor
    // getText() derseniz baslikla birlikte yazdiriyor buna gore testi sekillendirebilirsiniz
    @FindBy(xpath = "(//iframe)[1]")
    public WebElement haritaIFrame;
    // haritanın oldugu iframe'in xpath adresi bu sekilde
    // iframe icinde iframe gorunuyor ancak bu yeterli oldu
    @FindBy(xpath = "//div[@class='place-name']")
    public WebElement iFramePlaceNameElementi;
    // iFrame'de haritanin sol ust kosesinde adres basligi seklinde kisa bir metin
    @FindBy(xpath = "(//a[@href=\"https://qa.hauseheaven.com/contact\"])[1]")
    public static WebElement contactBaslik;
    @FindBy(xpath = "//div[@class=\"contact-message contact-success-message\"]")
    public WebElement sendMessageSuccesfully;


//****************************HOME PAGE*******************************************


    @FindBy(xpath = "(//div[@class='slick-list draggable'])[1]")
    public WebElement homePageIlkMulkIlani;//9876 Elmwood Avenue adlı ilan
    @FindBy(xpath = "//input[@id=\"name\"]")
    public WebElement emlakciNameBox;
    @FindBy(xpath = "//input[@name=\"phone\"]")
    public WebElement emlakciPhoneBox;
    @FindBy(xpath = "//input[@id=\"email\"]")
    public WebElement emlakciEmail;
    @FindBy(xpath = "//textarea[@name=\"content\"]")
    public WebElement emlakciMessageBox;
    @FindBy(xpath = "//*[@id=\"consult-form\"]/div/div[6]/button")  //degistirildi!!!!!
    public WebElement emlakciSendMessageButton;
    @FindBy(xpath = "//div[@id=\"alert-container\"]")
    public WebElement mesajGonderildiMi;


    //************************** ADMİN REAL STATE PAGE*******************************************************

    @FindBy(id = "cms-plugins-property")
    public WebElement propertiesButonu;       //Real Estate butonu altındaki "properties" butonu
    @FindBy(xpath = "//li[@id=\"cms-plugins-re-feature\"]")
    public WebElement adminRealEstateFeature;
    @FindBy(xpath = "//li[@id=\"cms-plugins-facility\"]")
    public WebElement adminRealEstateFacilities;
    @FindBy(xpath = "//li[@id=\"cms-plugins-real-estate-category\"]")
    public WebElement adminRealEstateCategories;
    @FindBy(xpath = "//li[@id=\"cms-plugins-real-estate-type\"]")
    public WebElement adminRealEstateTypes;

    //************************ADMİN CONSULT PAGE**********************************************

    @FindBy(xpath = "//a[@href=\"https://qa.hauseheaven.com/admin/real-estate/consults\"][1]")
    public WebElement adminConsults;
    // Admin sayfasında sol taraftaki menülerden Consults
    @FindBy(xpath = "//a[@class='btn btn-secondary dropdown-toggle']")
    public WebElement adminConsultsbulkActons;
    // Admin sayfasında Consults tıklanınca açılan pencerede bulunur
    @FindBy(xpath = "//button[@class='btn btn-primary btn-show-table-options']")
    public WebElement adminConsultsFilters;
    // Admin sayfasında Consults menüsünde bulunan Filters menüsü
    @FindBy(xpath = "//input[@type='search']")
    public WebElement adminConsultsSearch;
    // Admin sayfasında Consults menüsünde search(arama) menüsü
    @FindBy(xpath = "//i[@class='fas fa-sync']")
    public WebElement adminConsultsReload;
    // Admin sayfasında Consults menüsünde Reload( tekrar yüklemek) kısmı
    @FindBy(xpath = "//th[@class='text-start no-sort sorting_disabled']")
    public WebElement adminConsultsCheckboxKutusu;
    // Admin sayfasında Consults menüsünde tüm seçenekleri seçmek için kullanılan küçük (checkbox) kutu
    @FindBy(xpath = "//th[@title=\"Name\"]")
    public WebElement adminConsultsName;
    // Admin sayfasında Consults menüsünde başlık kısmında yer alan NAME bölümü (isime göre sıralar)
    @FindBy(xpath = "//th[@title=\"Email\"]")
    public WebElement adminConsultsEmail;
    // Admin sayfasında Consults mensünde başlık kısmında yer alan email( emaile göre sıralar)
    @FindBy(xpath = "//th[@title='Phone']")
    public WebElement adminConsultsPhone;
    // Admin sayfasında Consults menüsünde açılan sayfada Phone yazan kısım (phone no ya göre sıralar)
    @FindBy(xpath = "//th[@title='Created At']")
    public WebElement adminConsultsCreatedAt;
    // Admin sayfasında Consults menüsünde açılan sayfada Created at kısmı (tarihe göre sıralar)
    @FindBy(xpath = "//th[@title='Status']")
    public WebElement adminConsultsStatus;
    // Admin sayfasında Consults menüsünde açılan sayfada Status  kısmı (statüs e göre sıralar)
    @FindBy(xpath = "//a[@class='btn btn-icon btn-sm btn-primary'][1]")
    public WebElement adminConsultsEdit;
    // Admin sayfasında Consults menüsünde açılan sayfada Operations yazısının altındaki edit menüsü
    @FindBy(xpath = "//*[@role='textbox']")
    public WebElement adminConsultsStatüsReadUnRead;
    // Admin sayfasında Consults menüsünde edit tıklandıktan sonra Statüs olarak gösterilen alan Read
    // Admin sayfasında Consults menüsünde edit tıklandıktan sonra Statüs olarak gösterilen alan UnRead

    @FindBy(xpath = "//span[@class='badge bg-secondary bold badge-dt']")
    public WebElement adminConsultsRecordsSayisi;
    // Admin sayfasında Consults menüsünde en alt bölümde kayıtların sayısını gösteren bölüm

    @FindBy(xpath = "//*[@class=' text-start column-key-email'][1]")
    public WebElement adminConsultsKayitlidanişirlarinIlki;
    // Admin sayfasında Consults menüsünde  ilk sırada olan kişinin bilgileri

    @FindBy(xpath = "//span[@class=\"badge badge-success menu-item-count unread-consults\"]")
    public WebElement adminConsultButtonUstundekiSayi;
    @FindBy(xpath = "//span[@id=\"select2-status-container\"]")
    public WebElement readButton;
    @FindBy(xpath = "(//button[@name=\"submit\"])[1]")
    public WebElement save_exitButton;
    @FindBy(xpath = "//div[@class=\"toast-title\"]")
    public WebElement popUp;

    //***********************************ADMİN LOCATİON PAGE**********************************

    @FindBy(xpath = "(//a[@href=\"https://qa.hauseheaven.com/admin/states\"])[1]")
    public WebElement adminLocationsStates;
    @FindBy(xpath = "//button[@class=\"btn btn-primary btn-show-table-options\"]")
    public WebElement adminLocationStatesFilters;
    @FindBy(xpath = "//input[@class=\"form-control input-sm\"]")
    public WebElement adminLocationsStatesSearch;
    @FindBy(xpath = "//span[@data-action=\"create\"]")
    public WebElement adminLocationsStatesCreate;
    @FindBy(xpath = "//i[@class=\"fas fa-sync\"]")
    public WebElement adminLocationsStatesReload;
    @FindBy(xpath = "//span[@id=\"select2-country_id-container\"]")
    public WebElement adminLocationsStatesCreateCountry;
    @FindBy(xpath = "(//button[@name=\"submit\"])[1]")
    public WebElement adminLocationsStatesCreateSaveExit;
    @FindBy(xpath = "//div[@class=\"btn-group\"]")
    public WebElement blunkAction;
    @FindBy(xpath = "//span[@class=\"badge bg-secondary bold badge-dt\"]")
    public WebElement recordSayisi;
    @FindBy(xpath = "(//i[@class=\"fa fa-trash\"])[1]")
    public WebElement copKutusu;
    @FindBy(xpath = "//button[@class=\"float-end btn btn-danger delete-crud-entry\"]")
    public WebElement deleteButton;
    @FindBy(xpath = "//div[@class=\"toast-title\"]")
    public WebElement popUpLocation;

    //********************************************************************************
    //********************  AYSEL HANIM  **********************************************

    //*************  User Story 008 ****************

    @FindBy(xpath = "//button[@class=\"js-cookie-consent-agree cookie-consent__agree\"]")
    public WebElement cookiesButton; //cookies
    @FindBy(xpath = "(//div[@class=\"agents-grid\"])[2]")
    public WebElement agentsIkinciElementt;  //Agents sayfasi ikinci siradaki element
    @FindBy(xpath = "(//span[@class='fr-position'])[2]")
    public WebElement agentsIkinciIlanPropertiesElementi; // ikinci siradaki elementin gayrimenkul sayisi
    @FindBy(xpath = "(//div[@class=\"col-lg-4 col-md-6 col-sm-12\"])[1]")
    public WebElement ikinciAgentIlkElementi; // ikinci siradaki elementin gayrimenkul sayisi
    @FindBy(xpath = "(//div[@class=\"col-lg-4 col-md-6 col-sm-12\"])[2]")
    public WebElement ikinciAgentIkıncıElementi; // ikinci siradaki elementin gayrimenkul sayisi
    @FindBy(xpath = "(//div[@class=\"col-lg-4 col-md-6 col-sm-12\"])[3]")
    public WebElement ikinciAgentUcuncuElementi; // ikinci siradaki elementin gayrimenkul sayisi
    @FindBy(xpath = "(//div[@class=\"col-lg-4 col-md-6 col-sm-12\"])[4]")
    public WebElement ikinciAgentDorduncuElementi; // ikinci siradaki elementin gayrimenkul sayisi
    @FindBy(xpath = "(//div[@class='col-lg-4 col-md-6 col-sm-12'])[1]")
    public WebElement AgentsIlkSatilikElementininGorunurlugu; // birinci siradaki ilanin satilik elementinin gorunurlugu
    @FindBy(xpath = "(//span[@class='fr-position'])[1]")
    public WebElement agentsIlkIlanPropertiesElementi; // birinci siradaki elementin gayrimenkul sayisi
    @FindBy(xpath = "//*[text()=\" +157352167013\"]")
    public WebElement digerBilgiler;
    @FindBy(xpath = "//*[text()=\" +15342328062\"]")
    public WebElement ikinciSiradakininDigerBilgileri;
    @FindBy(xpath = "//*[@role='tablist']")
    public WebElement agentSatilikKiralikButonElementi; // ilanlarin satilik-kiralik buton elemnti
    @FindBy(xpath = "//*[@id=\"myTab\"]")
    public WebElement agentSatilikKiralikButonElementii; // ilanlarin satilik-kiralik buton elemnti
    @FindBy(xpath = "//*[@id=\"navigation\"]/div[2]/ul[1]/li[4]/a") // anasayfa AgentsElementi
    public WebElement agentsMenuu;
    @FindBy(xpath = "(//div[@class=\"col-lg-4 col-md-6 col-sm-12\"])[1]")
    public WebElement agentsIlkElementt;

    //****************** User Story 016 *************

    @FindBy(xpath = "//a[@class=\"nav-brand\"]")
    public WebElement logoButonu;  // Header kısmındaki Logo butonu
    @FindBy(xpath = "//a[@href=\"https://qa.hauseheaven.com/\"]")
    public WebElement homeLinkii;  // Header kısmındaki Home butonu
    @FindBy(xpath = "//*[@id=\"navigation\"]/div[2]/ul[1]/li[2]/a")
    public WebElement listingLinkii; // Header kısmındaki Listing butonu
    @FindBy(xpath = "//*[@id=\"navigation\"]/div[2]/ul[1]/li[3]/a")
    public WebElement projectsLinkii; // Header kısmındaki Projects butonu
    @FindBy(xpath = "//*[@id=\"navigation\"]/div[2]/ul[1]/li[4]/a")
    public WebElement agentsLinkii; // Header kısmındaki Agents butonu
    @FindBy(xpath = "//*[@id=\"navigation\"]/div[2]/ul[1]/li[5]/a")
    public WebElement blogLinkii; // Header kısmındaki Blog butonu
    @FindBy(xpath = "//*[@id=\"navigation\"]/div[2]/ul[1]/li[6]/a")
    public WebElement contactLinkii; // Header kısmındaki Contact butonu
    @FindBy(xpath = "//*[@id=\"navigation\"]/div[2]/ul[1]/li[7]/a")
    public WebElement signUpLinkii; // Header kısmındaki Sign Up butonu
    @FindBy(xpath = "//a[@class=\"text-success\"]")
    public WebElement addPropertyLinkii; // Header kısmındaki Add Property butonu
    @FindBy(xpath = "//i[@class=\"fas fa-user\"]")
    public WebElement userLinki; // Header kısmındaki User butonu
    @FindBy(xpath = "//a[@href=\"https://hauseheaven.com/login\"]")
    public WebElement SignInLinkii; // Header kısmındaki Sign In butonu
    @FindBy(xpath = "(//li[@class=\"login-item\"])[2]")
    public WebElement logoutLinki; // Header kısmındaki Logout butonu
    @FindBy(xpath = "//a[@class=\"text-white\"]")
    public WebElement wishlistLinkii; // Header kısmındaki Wishlist butonu

    /**************  User Story 019 **************/

    @FindBy(xpath = "(//div[@class=\"os-app-caps\"])[1]")
    public WebElement googlePlayLinkii; // Footer/Download Apps kısmındaki Google Play linki
    @FindBy(xpath = "(//div[@class=\"os-app-caps\"])[2]")
    public WebElement appStoreLinkii; // Footer/Download Apps kısmındaki App Store linki
    @FindBy(xpath = "//div[@class=\"footer-bottom\"]")
    public WebElement sosyalMedyaaDiv; // Footer kısmındaki Sosyal medya ikonları olan tüm satır
    @FindBy(xpath = "//span[text()='Contact us']")
    public WebElement contactUsLinki; // Footer/About kısmındaki Contact us linki
    @FindBy(xpath = "//a[@title=\"Facebook\"]")
    public WebElement facebookIkonu; // Footer en alt kısımdaki Facebook ikonu
    @FindBy(xpath = "//a[@title=\"Twitter\"]")
    public WebElement twitterIkonu; // Footer en alt kısımdaki Twitter ikonu
    @FindBy(xpath = "//a[@title=\"Instagram\"]")
    public WebElement instagramIkonu; // Footer en alt kısımdaki Instagram ikonu
    @FindBy(xpath = "//a[@title=\"Linkedin\"]")
    public WebElement linkedinIkonu; // Footer en alt kısımdaki Linkedin ikonu
    @FindBy(xpath = "//a[@title=\"Pinterest\"]")
    public WebElement pinterestIkonu; // Footer en alt kısımdaki Pinterest ikonu



    //**************** User Story 034 ******************

    @FindBy(xpath = "//*[@id=\"botble-real-estate-forms-property-form\"]/div[2]/div[2]/div[3]/div/button[1]")
    public WebElement saveAndExitElementii;
    @FindBy(xpath = "//*[@id=\"botble-real-estate-forms-property-form\"]/div[2]/div[1]/div[1]/div/div[5]/div[3]/div[2]/div")
    public WebElement paragraphElementi;
    @FindBy(xpath = "//*[@id=\"botble-real-estate-tables-property-table\"]")//Tum ilanlarin locate
    public WebElement propertiesButonuTumIlanlar;
    @FindBy(id = "header_layout")
    public WebElement headerloyoutElementi;       //Real Estate butonu altındaki "properties" altındaki CREATE Elementi tıklandığındaki "headerloyout" ELEMENTİ
    @FindBy(id = "select2-moderation_status-container")
    public WebElement moderationStatussElementi;       //Real Estate butonu altındaki "properties" altındaki CREATE Elementi tıklandığındaki "moderationStatuss" ELEMENTİ
    @FindBy(xpath = "(//label[@class='checkbox-inline'])[1]")
    public WebElement wifiElementi;       //Real Estate butonu altındaki "properties" altındaki CREATE Elementi tıklandığındaki WİFİ ELEMENTİ
    @FindBy(id = "type_id")
    public WebElement typeElementi;       //Real Estate butonu altındaki "properties" altındaki CREATE Elementi tıklandığındaki TYPE ELEMENTİ
    @FindBy(xpath = "//select[@name='facilities[][id]']")
    public WebElement selectfacilityElementi;       //Real Estate butonu altındaki "properties" altındaki CREATE Elementi tıklandığındaki "selectfacility" ELEMENTİ
    @FindBy(xpath = "//input[@name='facilities[][distance]']")
    public WebElement distanceElementi;       //Real Estate butonu altındaki "properties" altındaki CREATE Elementi tıklandığındaki DISTANCE ELEMENTİ
    @FindBy(xpath = "//input[@placeholder='Number bathrooms']")
    public WebElement numberBathroomsElementi;       //Real Estate butonu altındaki "properties" altındaki CREATE Elementi tıklandığındaki numberBathrooms ELEMENTİ
    @FindBy(xpath = "//input[@placeholder='Number floors']")
    public WebElement numberFloorsElementi;       //Real Estate butonu altındaki "properties" altındaki CREATE Elementi tıklandığındaki "numberFloors" ELEMENTİ
    @FindBy(xpath = "//input[@placeholder='Square :unit']")
    public WebElement squareElementi;       //Real Estate butonu altındaki "properties" altındaki CREATE Elementi tıklandığındaki SQUARE ELEMENTİ
    @FindBy(xpath = "//input[@placeholder='Price']")
    public WebElement priceElementi;       //Real Estate butonu altındaki "properties" altındaki CREATE Elementi tıklandığındaki TİTLE ELEMENTİ
    @FindBy(id = "select2-currency_id-container")
    public WebElement currencyElementi;       //Real Estate butonu altındaki "properties" altındaki CREATE Elementi tıklandığındaki CURRENCY ELEMENTİ
    @FindBy(id = "latitude")
    public WebElement latudeElementi;       //Real Estate butonu altındaki "properties" altındaki CREATE Elementi tıklandığındaki LATUDE ELEMENTİ
    @FindBy(id = "longitude")
    public WebElement longitudeElementi;       //Real Estate butonu altındaki "properties" altındaki CREATE Elementi tıklandığındaki "longitude" ELEMENTİ
    @FindBy(xpath = "//input[@placeholder='Number bedrooms']")
    public WebElement numberBedroomsElementi;       //Real Estate butonu altındaki "properties" altındaki CREATE Elementi tıklandığındaki "numberBedrooms" ELEMENTİ
    @FindBy(xpath = "//input[@placeholder='Property location']")
    public WebElement propertyLocationElementi;       //Real Estate butonu altındaki "properties" altındaki CREATE Elementi tıklandığındaki "Property location" ELEMENTİ
    @FindBy(xpath = "(//textarea[@class='form-control'])[1]")
    public WebElement descrioptionTextAreaElementi;       //Real Estate butonu altındaki "properties" altındaki CREATE Elementi tıklandığındaki DESCRIOPTION TEXT AREA ELEMENTİ
    @FindBy(xpath = "//input[@placeholder='Title']")
    public WebElement titleElementi;       //Real Estate butonu altındaki "properties" altındaki CREATE Elementi tıklandığındaki TİTLE ELEMENTİ
    @FindBy(xpath = "(//i[@class='fa fa-edit'])[2]")
    public WebElement editElementi;       //Real Estate butonu altındaki "properties" altındaki EDIT Elementi
    @FindBy(xpath = "(//a[@class='btn btn-icon btn-sm btn-danger deleteDialog'])[1]")
    public WebElement deleteElementi;       //Real Estate butonu altındaki "properties" altındaki DELETE Elementi

    //****************** User Story 046 *********************

    @FindBy(xpath = "//*[@id=\"botble-payment-tables-payment-table\"]/tbody/tr[1]/td[3]")
    public WebElement aldigimKrediGoruntulendi; //sayfanın sonundaki recorts sayısını gosteren alan
    @FindBy(xpath = "//button[@class=\"btn btn-primary mt-2\"]")
    public WebElement purchase;
    @FindBy(xpath = "//*[@id=\"navigation\"]/div[2]/ul[2]/li[3]/a")
    public WebElement Logout;

    //*********************************************************************************
    //**********************  ADEM BEY  ***********************************************

    @FindBy(xpath = "//a[@class=\"text-success\"]")   //Add Property tıklamak
    public WebElement addPropertyClick;
    @FindBy(xpath = "//button[text()='Search Result']")
    public WebElement searchResultButton;//aramayı baslatmak icin en sondaki buton
    @FindBy(xpath = "//h2[text()='How It Works?']")
    public WebElement homePageHowItworksBaslikElementi;// How it works baslıgı

    //adminblogpage

    @FindBy(xpath = "//li[@id=\"cms-plugins-blog\"]")
    public WebElement blogButton;
    // Admin sayfasi soldaki sidebar menude blog yazan ve tiklayinca asagiya dropdown menu acan buton

    @FindBy(xpath = "//li[@id=\"cms-plugins-blog-tags\"]")
    public WebElement blogTagsButton;
    //Blog tiklaninca acilan dropdwon menude Tags bolumu
    @FindBy(xpath = "(//a[@data-bs-original-title=\"Edit\"])[1]")
    public WebElement firstTagEditButton;
    // Tags tiklandiginda acilan sayfada ilk siradaki Tag'i duzenleme icin Edit baslikli buton

    @FindBy(xpath = "(//a[@data-bs-original-title=\"Delete\"])[1]")
    public WebElement firstTagDeleteButton;
    // Tags tiklandiginda acilan sayfada ilk siradaki Tag'i silme icin Delete baslikli buton
    @FindBy(xpath = "//span[@data-action=\"create\"]")
    public WebElement createNewTagButton;
    // Tags tiklandiginda acilan sayfada sol ustte +Create baslikli buton
    @FindBy(xpath = "//input[@placeholder=\"Name\"]")
    public WebElement nameTextBoxTags;
    // Tag listesinde herhangi bir tag tiklandiginda veya Tag sirasinda Edit butonu tiklandiginda
    // Acilan sayfada Name baslikli metin kutusu
    @FindBy(xpath = "//textarea[@id=\"description\"]")
    public WebElement descriptionTextBoxTags;
    // Tag duzenleme sayfasina girildiginde Description baslikli metin kutusu


    @FindBy(xpath = "(//button[@type=\"submit\" and @value=\"apply\"])[1]")
    public WebElement saveButtonTags;
    // Tag duzenleme sayfasina girildiginde sag ustte Save baslikli buton
    @FindBy(xpath = "//span[@class=\"badge bg-secondary bold badge-dt\"]")
    public WebElement totalTagsNumberElement;
    // Tags listesi altinda toplam kac Tag kaydi oldugunu gosteren alan

    @FindBy(xpath = "//a[@href=\"https://qa.hauseheaven.com/account/dashboard\"]")
    public WebElement userSignInButonu; //Kayıtlı kullanıcı girişi için anasayfadaki "Sign In" elementi
    @FindBy(xpath = "//p[@class='ck-placeholder']")   //Content yazmak için
    public WebElement contentClick1;
    @FindBy(xpath = "//input[@placeholder='Distance (Km)']")         //distance element
    public WebElement distanceElement;
    @FindBy(xpath = "//button[@class='js-cookie-consent-agree cookie-consent__agree']")         //cookies element
    public WebElement cookies;
    @FindBy(xpath = "//button[@class='btn btn-sm btn-success']")         //Save element
    public WebElement saveElement;
    @FindBy(xpath = "//input[@placeholder='Email/Username']")         //adminUserName Element
    public WebElement adminUserName;
    @FindBy(xpath = "//input[@placeholder='Password']")         //adminPassword Element
    public WebElement adminPassword;
    @FindBy(xpath = "//span[@class='signin']")         //adminSignInElement
    public WebElement adminSignIn;
    @FindBy(xpath = "//div[@class='toast-title']")         //adminDeleteBlogSucces
    public WebElement adminBlogSuccess;
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")         //USERALERTSUCCSES
    public WebElement userAlertSuccess;
    @FindBy(xpath = "(//a[@class='btn btn-icon btn-sm btn-primary'])[1]")         //USEREDİTBUTTON
    public WebElement userEditButon;
    @FindBy(xpath = "(//a[@class='btn btn-icon btn-sm btn-danger deleteDialog'])[1]")         //USERDELETEBUTTON
    public WebElement userDeleteButon;
    @FindBy(xpath = "(//button[@class='float-end btn btn-danger delete-crud-entry'])[1]")
    public WebElement userDeleteConfirmButon;//USERDELETECONFIRMBUTTON

    //**************************************************************************************
    //***************************** MUHAMMET BEY  *******************************************

    /*=================================================================*/

    @FindBy(xpath = "(//div[@class=\"col-lg-4 col-md-6 col-sm-12\"])[1]")
    public WebElement projectsIlkIlan;// Projects sayfası ilk ilan
    @FindBy(xpath = "(//div[@class=\"col-lg-4 col-md-6 col-sm-12\"])[2]")
    public WebElement projectsIkinciIlan;// Projects sayfası ikinci ilan
    @FindBy(xpath = "(//div[@class=\"col-lg-4 col-md-6 col-sm-12\"])[3]")
    public WebElement projectsUcuncuIlan;// Projects sayfası ücüncü ilan
    @FindBy(xpath = "//div[@class=\"col-lg-12 col-md-12 col-sm-12\"]")
    public WebElement projectsIlanAyrintiSayfasi;// Projects herhangi bir ilana tıklandıktan sonra ilana ait tüm detaylar

    @FindBy(xpath = "(//span[@role='presentation'])[1]")
    public WebElement searchCountry; // search butonunun oldugu kisimda arama yapilabildigi dogrulanmalidir
    @FindBy(xpath = "(//li[@role='option'])[1]")
    public WebElement ABD;
    @FindBy(xpath = "//h4[@class='mb-0']")
    public WebElement filtreSonucResults;

    //======================PROJECTS GIZEM YENI LOCATE===================//

    @FindBy(xpath = "//a[@href=\"https://qa.hauseheaven.com/projects\"]")
    public WebElement projebutton;
    @FindBy(xpath ="(//a[@href='https://qa.hauseheaven.com/admin/real-estate/packages'])[1]")
    public WebElement adminPackagesbuttton; // Admin sayfasi Packages butonu

    @FindBy(xpath ="//input[@class='form-control input-sm']")
    public WebElement adminPackagesbutonuSearchbox; // admin sayfasi Packages butonu Search box

    @FindBy(xpath = "//a[@class='btn btn-secondary dropdown-toggle']")
    public WebElement adminPackagesBulkactionButton; // admin sayfasi Packages buttonu Bulkaction box

    @FindBy(xpath = "//*[@data-action='create']")
    public WebElement adminPackagesbutonuCreate; //admin Packages sayfasinin Create bolumu


    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement adminPackagesbutonuCreatename; //admin Account sayfasinin Create butonu first name alani

    @FindBy(xpath = "(//input[@class='form-control input-mask-number'])[1]")
    public WebElement adminPackagesbutonuCreatePrice;


    @FindBy(xpath ="(//span[@class='select2-selection__rendered'])[1]") //(//span[@class='select2-selection__rendered'])[2]
    public WebElement adminPackagesbutonuCurrency; //[2] de publiched



    @FindBy(xpath = "(//input[@class='form-control input-mask-number'])[2]")
    public WebElement adminPackagesbutonuCreatePercentsave;


    @FindBy(xpath = "(//input[@id='price-number'])[2]")
    public WebElement adminPackagesbutonuCreateNumberoflistening;

    @FindBy(xpath = "(//input[@class='form-control input-mask-number'])[4]")
    public WebElement adminPackagesbutonuCreateLimitpurchasebyaccount;


    @FindBy(xpath ="//*[@for='price']")
    public WebElement adminPackagesbuttonuCreateIsdefault;
    @FindBy(xpath ="//input[@placeholder='Order by']")
    public WebElement adminPackagesbuttonuCreateOrder;

    // order asagi yukari oklar inspect edilmiyor

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement adminPackagesbutonuCreateSaveexit;//admin Packages  sayfasinin Create butonu Save& exit'i
    @FindBy(xpath ="(//button[@value='apply'])[1]")
    public WebElement adminPackagesbutonuCreateSaveButton; //Admin Packages sayfasinin Create butonu Save
    @FindBy(xpath = "(//a[@class='btn btn-icon btn-sm btn-primary'])[1]")
    public WebElement adminPackagesbutonuCreateEdit;
    @FindBy(xpath ="(//a[@class='btn btn-icon btn-sm btn-danger deleteDialog'])[1]")
    public WebElement adminPackagesbutonuCreateDelete;
    @FindBy(xpath ="//*[text()='Packages']")
    public WebElement adminPackagesGorunurluk;
    @FindBy(xpath ="//div[@id='main']")
    public WebElement adminPackagesListe;
    @FindBy(xpath ="//*[text()='New package']")
    public WebElement adminNewPackagesGorunurluk;
    @FindBy(xpath ="//a[text()='Can']")
    public WebElement adminPackagesListeSonEklenen;
    @FindBy(xpath ="(//button[text()='Delete'])[1]")
    public WebElement adminNewPackagesDeleteOnayButonu;
    @FindBy(xpath ="(//input[@type='checkbox'])[1]")
    public WebElement adminPackagesCheckboxButonu;
    @FindBy(xpath ="//div[@class='toast-message']")
    public WebElement adminPackagesDeleteOnaySonrasiSilindiMesaji;


    // **************************************   Posts >> Categories Bolumu  ********************************************

    @FindBy(xpath = "//a[@href=\"https://qa.hauseheaven.com/admin/blog/categories/create\"]")
    public WebElement createNewCategoryButton;
    // Blog menusu altinda Categories tiklandiginda acilan sayfada solda +Create baslikli buton
    @FindBy(xpath = "//input[@placeholder=\"Name\"]")
    public WebElement nameTextBoxCategories;
    // Categories tiklandiginda acilan sayfada Name baslikli metin kutusu
    @FindBy(xpath = "//select[@class=\"select-search-full ui-select select2-hidden-accessible\"]")
    public WebElement parentSelectMenuButton;
    // Categories tiklandiginda acilan sayfada Parent baslikli select menu butonu

    @FindBy(xpath = "//select[@id='status']")
    public WebElement statusSelectMenuCategories;
    // Categories tiklandiginda acilan sayfada Status baslikli select menu butonu

    @FindBy(xpath = "(//button[@value=\"apply\"])[1]")
    public WebElement saveButtonCategories;
    // Categories tiklandiginda acilan sayfada asagida Save baslikli buton

    //*************************************************************************************

    @FindBy(xpath = "//li[@id='cms-plugins-blog']")
    public WebElement blokBasliklari;
    @FindBy(xpath = "(//a[@class='nav-link'])[2]")
    public WebElement categoriesLinki;
    @FindBy(xpath = "//li[@id='cms-plugins-blog']")
    public WebElement adminBlokButton1;
    @FindBy(xpath = "//li[@id='cms-plugins-blog']")
    public WebElement saveExitButton;
    @FindBy(xpath = "//div[@class='tree-categories-body card-body']")
    public WebElement blokTumKategoriler;
    @FindBy(xpath = "//span[text()='Room Design']")
    public WebElement roomDesingGorunurluk;
    @FindBy(xpath = "(//a[@data-bs-original-title=\"Delete\"])[13]")
    public WebElement roomDesingDelete;
    @FindBy(xpath = "//button[@class='float-end btn btn-danger delete-crud-entry']")
    public WebElement deleteOnay;
    @FindBy(xpath = "//div[@text()='Success!']")
    public WebElement Onay;

    //**********************************************************************************
    //********************  BANU HANIM  **********************************************
    @FindBy(xpath = "//li[@id=\"cms-plugins-blog-post\"]")
    public WebElement blogPostsButton;
    // Blog tiklaninca acilan dropdwon menude Posts bolumu

    @FindBy(xpath = "//li[@id=\"cms-plugins-blog-categories\"]")
    public WebElement blogCategoriesButton;
    // Blog tiklaninca acilan dropdwon menude Categories bolumu

    @FindBy(xpath = "//input[@type=\"search\"]")
    public WebElement searchTextBox;
    // Blog >> Posts tiklaninca gelen ekranda ustte Search isimli metin kutusu

    @FindBy(xpath = "//span[@data-action=\"create\"]")
    public WebElement createnewPostButton;
    // Blog >> Posts tiklaninca gelen ekranda sag ustte +Create isimli buton

    @FindBy(xpath = "(//a[@data-bs-original-title=\"Edit\"])[1]")
    public WebElement firstPostEditButton;
    //  Post listesinde ilk siradaki post'un Operations basligi altindaki Edit Butonu
    @FindBy(xpath = "//a[@href=\"#tab_history\"]")
    public WebElement revisionHistoryButton;
    // Post duzenleme sayfasina girildiginde sol ustteki Revision History butonu

    @FindBy(xpath = "//input[@placeholder=\"Name\"]")
    public WebElement nameTextBoxPosts;
    // Post duzenleme sayfasina girildiginde Name baslikli metin kutusu
    // Blog altinda Posts, Categories ve Tags alaninda ayni isimde
    // Bircok metin kutulari oldugundan
    // Sonuna hangi sayfada oldugunu belirtir ismini ekledim

    @FindBy(xpath = "(//textarea[@placeholder=\"Short description\"])[1]")
    public WebElement descriptionTextBox;
    // Post duzenleme sayfasina girildiginde Description baslikli metin kutusu

    @FindBy(xpath = "//div[@aria-label=\"Editor editing area: main\"]")
    public WebElement contentTextBox;
    // Post duzenleme sayfasina girildiginde Content baslikli metin kutusu

    @FindBy(xpath = "(//button[@value=\"apply\" and @class=\"btn btn-success\"])[1]")
    public WebElement saveButtonPosts;
    // Post duzenleme sayfasina girildiginde sag ustte Save baslikli buton
    @FindBy(xpath = "//input[@name=\"categories[]\" and @value=\"1\"]")
    public WebElement latestNewsCheckbox;
    // Post duzenleme sayfasina girildiginde sag tarafta Categories
    // basligi altinda Latest news adli kategoriyi isaretlemek icin checkbox
    @FindBy(xpath = "//input[@name=\"categories[]\" and @value=\"4\"]")
    public WebElement buildingMaterialsCheckbox;
    // Post duzenleme sayfasina girildiginde sag tarafta Categories
    // basligi altinda Building materials adli kategoriyi isaretlemek icin checkbox

    @FindBy(xpath = "//div[text()='Success!']")
    public WebElement succesfulToastMessage;
    // Yeni kategori eklendiginde sag asagida acilan Succes! baslikli toast message
    // Birkac saniye sonra gittigi icin kodlarda gorunmeyebilir
    // test asamasinda dikkat etmek gerekli


    // Tags listesi altinda toplam kac Tag kaydi oldugunu gosteren alan

    @FindBy(xpath = "(//li[@class=\"dropdown dropdown-extended dropdown-inbox\"])[2]")
    public WebElement adminHeaderContactsElement;
    @FindBy(xpath = "//span[@class=\"bold\"]")
    public WebElement adminHeaderContactMesajSayisi;
    @FindBy(xpath = "//select[@id=\"status\"]")
    public WebElement adminBlogPostSelectMenu;
    @FindBy(xpath = "(//button[@type=\"submit\"])[1]")
    public WebElement adminBlogPostSaveAndExit;
    @FindBy(xpath = "(//td[@class=\" text-start column-key-name\"])[1]")
    public WebElement firstBlogElementName;
    @FindBy(xpath = "//span[@class=\"html-diff-content\"]")
    public WebElement blogPostChangeControl;
    @FindBy(xpath ="(//a[@class=\"btn btn-icon btn-sm btn-danger deleteDialog\"])[1]")
    public WebElement blogPostDeleteSearchSonrasi;
    @FindBy(xpath = "//button[@class=\"float-end btn btn-danger delete-crud-entry\"]")
    public WebElement blogPostDeleteSearchSonrasiConfirm;
    @FindBy(xpath = "//input[@class=\"form-control input-sm\"]")
    public WebElement adminContactSearchBox; //Admin sayfasinda contact bolumundeki Search box elementi
    @FindBy(xpath = "//button[@class=\"btn btn-secondary buttons-collection dropdown-toggle buttons-export\"]")
    public WebElement adminContactExportButton; //Admin sayfasindaki comyact bolumunde bulunan export buton elementi
    @FindBy(xpath = "//button[@class=\"btn btn-secondary buttons-reload\"]")
    public WebElement adminContactReloadButton; //Admin sayfasindaki comyact bolumunde bulunan reload buton elementi
    @FindBy(xpath = "//span[@class=\"badge bg-secondary bold badge-dt\"]")
    public WebElement adminContactRecortSayisi; //Admin sayfasindaki comyact bolumunde sayfanin en altinda bulunan bulunan Recort sayısı
    @FindBy(xpath = "(//a[@class=\"btn btn-icon btn-sm btn-primary\"])[1]")
    public WebElement adminContactEditElementi; //NOT: daha assagida bulunan ziyaretci
    // editleri duzenlenmek istiyorsanız koseli
    //parantez icine bulunduğu satirin sayisini yazın
    @FindBy(xpath = "(//div[@class=\"checkbox checkbox-primary table-checkbox\"])[1]")
    public WebElement adminContactCheckBox; //NOT:alt satirdaki check boxlar kullanılmak isteniyorsa
    // köşeli parantez içine satır no sunu yazarak uygulayabilirsiniz
    @FindBy(xpath = "(//button[@class=\"btn btn-info\"])[1]")
    public WebElement adminContactEditSaveExitButton; // Admin sayfasında contact bolumunde edit içerisindeki save&exit buton elementi
    @FindBy(xpath = "(//button[@class=\"btn btn-success\"])[1]")
    public WebElement adminContactEditSaveButton; //Admin sayfasında contact bolumunde edit içerisindeki save buton elementi
    @FindBy(xpath = "(//a[@href=\"https://qa.hauseheaven.com/admin/contacts\"])[3]")
    public WebElement adminContactButton;
    @FindBy(tagName = "select")
    public WebElement adminContactIcerikStatusSelectMenusu;
    @FindBy(xpath = "//span[@class=\"label-success status-label\"]")
    public WebElement adminContactSearchSonrasiStatusGoruntule;
    @FindBy(xpath = "(//td[@class=\" text-start column-key-name\"])[1]")
    public WebElement searchArkasindanElement;
    @FindBy(xpath = "//a[@class=\"btn btn-secondary dropdown-toggle\"]") //Bulk Actions tıklamak icin
    public WebElement bulkActionsClick;
    @FindBy(xpath = "//input[@class=\"form-control input-sm\"]") //Search tıklamak icin
    public WebElement searchClick;
    @FindBy(xpath ="(//input[@type=\"checkbox\"])[2]")
    public WebElement pendingPropertiesCheckbox;
    @FindBy(xpath = "(//select[@class=\"form-control input-value filter-column-value select ui-select\"])[2]")
    public WebElement moderationStatusSelectMenu;
    @FindBy(xpath = "//button[@class=\"float-end btn btn-info confirm-bulk-change-button\"]")
    public WebElement moderationStatusSubmit;
    @FindBy(xpath = "//a[@data-key=\"moderation_status\"]")
    public WebElement moderationStatusSecenegi;
    @FindBy(xpath = "(//a[@href=\"javascript:;\"])[3]")
    public WebElement bulkChanges;
    @FindBy(xpath = "(//td[@class=\"  column-key-moderation_status\"])[1]")
    public WebElement activePropertiesModerationStatusGorunum;
    @FindBy(xpath = "(//button[@class='btn btn-success'])[1]")
    public WebElement saveElementi;       //Real Estate butonu altındaki "properties" altındaki CREATE Elementi tıklandığındaki "SAVE" ELEMENTİ
    @FindBy(xpath = "(//td[@class=\" text-start column-key-name\"])[1]")
    public WebElement ilkSiradakiFeature;
    @FindBy(xpath = "//td[@class=\" text-start column-key-name\"])[2]")
    public WebElement ikinciSiradakiFeature;
    @FindBy(xpath = "//span[@class=\"badge bg-secondary bold badge-dt\"]")
    public WebElement featureSayisiElementi;
    @FindBy(xpath = "(//a[@href=\"https://qa.hauseheaven.com/admin/real-estate/property-features\"])[1]")
    public WebElement adminFeatureLink;
    @FindBy(xpath = "//select[@id='icon']")
    public WebElement featureIconSelectMenusu;
    @FindBy(xpath = "div//[text()='Succes!']")
    public WebElement featureKaydedildiMesaji;
    @FindBy(xpath = "(//a[@data-bs-original-title=\"Edit\"])[1]")
    public WebElement ilkFeatureEdit;
    @FindBy(xpath = "(//a[@data-bs-original-title=\"Delete\"])[1]")
    public WebElement ilkFeatureDelete;
    @FindBy(xpath = "//button[@class=\"float-end btn btn-danger delete-crud-entry\"]")
    public WebElement featureDeleteConfirm;
    @FindBy(xpath = "//*[@id=\"cms-plugins-real-estate\"]")
    public WebElement adminRealEstateButton;
    @FindBy(xpath = "(//span[@class='title'])[3]")
    public WebElement testimonialsButton;   // admin sayfasi testimonials butonu@FindBy(xpath = "//span[@data-action='create']")
    @FindBy(xpath = "//span[@data-action='create']")
    public WebElement createButton; //testimonials sayfasinda create yapmak icin kullanilir
    @FindBy(xpath = "//input[@type='search']")
    public WebElement testimonialsSearchButton;    // Testimonials sayfasinda search butonu
    @FindBy(xpath = "//span[@class=\"badge bg-secondary bold badge-dt\"]")
    public WebElement adminTestimonialsSonucSayisi;
    @FindBy(xpath = "(//a[@data-bs-original-title=\"Edit\"])[1]")
    public WebElement adminTestimonialsIlkTestimonial;
    @FindBy(xpath = "(//p)[3]")
    public WebElement adminTestimonialsContent;
    @FindBy(xpath = "//input[@placeholder=\"Name\"]")
    public WebElement adminTestimonialsNameBox;
    @FindBy(xpath = "(//button[@type=\"submit\"])[1]")
    public WebElement adminTestimonialsSaveAndExit;
    @FindBy(xpath = "(//td[@class=\" text-start column-key-name\"])[1]")
    public WebElement adminTestimonialFirstName;
    @FindBy(xpath = "(//button[@name=\"submit\"])[2]")
    public WebElement adminTestimonialSave;
    @FindBy(xpath = "//a[@class=\"btn btn-icon btn-sm btn-danger deleteDialog\"]")
    public WebElement adminTestimonialsDelete;
    @FindBy(xpath = "//button[@class=\"float-end btn btn-danger delete-crud-entry\"]")
    public WebElement adminTestimonialsDeleteConfirm;
    @FindBy(xpath = "//a[@class=\"btn btn-icon btn-sm btn-primary\"]")
    public WebElement adminTestimonialsEdit;
    @FindBy(xpath = "//div[text()='Succes!']")
    public WebElement adminTestimonialsDeletedMessage;
    @FindBy(xpath = "//div[@class='dib light-gray-text']")
    public WebElement youHaveCreatedPropertyYazisi; //User Dashboar altındaki "You have created property" yazısı
    @FindBy(xpath = "//li[@class=\"dropdown dropdown-user\"]")
    public WebElement adminTestKose;
    @FindBy(xpath = "//a[@class=\"btn-logout\"]")
    public WebElement adminTestLogoutButton;
    @FindBy(xpath = "//div[@class=\"contact-message contact-success-message\"]")
    public WebElement mesajGonderildiYazisi;
    @FindBy(xpath = "(//*[@name=\"name\"])")
    public WebElement nameTextBox;
    @FindBy(xpath = "(//*[@name=\"phone\"])")
    public WebElement PhoneTextBox;
    @FindBy(xpath = "(//*[@name=\"email\"])[1]")
    public WebElement emailTextBox;
    @FindBy(xpath = "(//*[@name=\"content\"])[1]")
    public WebElement messageTextBox;
    @FindBy(xpath = "//h4[@class=\"listing-name\"]")
    public WebElement listingPageSearchSonrasiPropertyName;
    @FindBy(xpath = "(//h3)[1]")
    public WebElement listingPagePropertyTitle;
    @FindBy(xpath = "(//a[@href=\"https://qa.hauseheaven.com/login\"])[2]")
    public WebElement userDashboardSignIn;
    @FindBy(xpath = "//div[@aria-label=\"Editor editing area: main\"]")
    public WebElement addPropertyContent;
    @FindBy(xpath = "//input[@placeholder=\"Distance (Km)\"]")
    public WebElement addPropertyDistance;
    @FindBy(xpath = "//button[@class=\"btn btn-sm btn-success\"]")
    public WebElement addPropertySave;
    @FindBy(xpath = "//div[@class='alert alert-succes alert-dismissible']")
    public WebElement propertySuccesfullyAdded;
    @FindBy(xpath = "//select[@name=\"facilities[][id]\"]")   //Select facility tıklamak için(dropdown)
    public WebElement selectFacilityClick;

    //*****************************************************************************
    //********************  MEHDİ BEY  *******************************************

    // Sag tarafta iletisim bilgilerinin oldugu yerde Reach Us bolumunun tamamini aliyor
    // Reach Us seklindeki basligi ve alttaki adres seklindeki metni tam olarak ayiramiyor
    // getText() derseniz baslikla birlikte yazdiriyor buna gore testi sekillendirebilirsiniz

    @FindBy(xpath = "(//*[@class='cn-info-detail'])[1]")
    public WebElement reachUsAdresSatiri;

    @FindBy(xpath = "//*[text()='Email']")
    public WebElement emailBilgiAlani;
    // Sag tarafta iletisim bilgilerinin oldugu yerde E-mail bolumunun tamamini aliyor
    // E-mail seklindeki basligi ve alttaki adres seklindeki metni tam olarak ayiramiyor
    // getText() derseniz baslikla birlikte yazdiriyor buna gore testi sekillendirebilirsiniz

    @FindBy(xpath = "(//*[@class='cn-info-detail'])[2]")
    public WebElement emailBilgiSatiri;

    @FindBy(xpath = "//*[text()='Call Us']")
    public WebElement callUsBilgiAlani;
    // Sag tarafta iletisim bilgilerinin oldugu yerde Call Us bolumunun tamamini aliyor
    // Call Us seklindeki basligi ve alttaki adres seklindeki metni tam olarak ayiramiyor
    // getText() derseniz baslikla birlikte yazdiriyor buna gore testi sekillendirebilirsiniz
    @FindBy(xpath = "(//*[@class='cn-info-detail'])[3]")
    public WebElement callUsBilgiSatiri;
    // Yalnızca telefon numarasinin oldugu satiri almak icin bu sekilde copy-xpath yolu da kullanilabilir
    // Ancak bir onceki kadar saglikli olmayabilir div'lerin degismesi ihtimali nedeniyle


    @FindBy(xpath = "(//*[@href=\"https://qa.hauseheaven.com/admin/blog/posts\"])[1]")
    public WebElement blogButonu;   //Header bölümündeki "Blog" butonu

    @FindBy(xpath = "(//*[@class=\"nav-link nav-toggle\"])[4]")
    public WebElement realEstateButton;

    @FindBy(xpath = "(//*[@href=\"https://qa.hauseheaven.com/admin/real-estate/types\"])[1]")
    public WebElement realEstateTypeButton;

    @FindBy(xpath = "//*[@class=\"badge bg-secondary bold badge-dt\"]")
    public WebElement realEstateTypeResulText;

    @FindBy(xpath = "//*[@data-action=\"create\"]")
    public WebElement realEstateTypeCreatButton;

    @FindBy(xpath = "(//*[@class=\"form-control\"])[1]")
    public WebElement realEstateTypeNameTextBox;

    @FindBy(xpath = "(//*[@class=\"form-control\"])[2]")
    public WebElement realEstateTypeCodeTextBox;

    @FindBy(xpath = "//*[@id=\"slug\"]")
    public WebElement realEstateTypeSlugTextBox;

    @FindBy(xpath = "//*[@type=\"number\"]")
    public WebElement realEstateTypeOrderTextBox;

    @FindBy(xpath = "(//button[@type=\"submit\"])[1]")
    public WebElement realEstateTypeSaveExitButton;

    @FindBy(xpath = "//div[text()='Deleted successfully']")
    public WebElement realEstateTypeSaveDeletedSuccesMessage;

    @FindBy(xpath = "(//a[@class=\"btn btn-icon btn-sm btn-primary\"])[1]")
    public WebElement realEstateTypEditButton;

    @FindBy(xpath = "//*[@name=\"name\"]")
    public WebElement realEstateTypMexNameTextBox;

    @FindBy(xpath = "//div[text()='Updated successfully']")
    public WebElement realEstateTypeUpdatedSuccesMessage;

    @FindBy(xpath = "(//*[@class=\"fa fa-trash\"])[1]")
    public WebElement realEstateTypeDeletedButton;

    @FindBy(xpath = "(//*[@class=\"float-end btn btn-danger delete-crud-entry\"])[1]")
    public WebElement realEstateTypeConfirmDeletedButton;
    @FindBy(xpath = "(//*[@class=\"property_block_title\"])[1]")
    public WebElement ilkMulkdetailesfeatures;
    @FindBy(xpath = "(//*[@class=\"property_block_title\"])[2]")
    public WebElement ilkMulkDescription;
    @FindBy(xpath = "(//*[@class=\"property_block_title\"])[5]")
    public WebElement ilkMulkGallery;
    @FindBy(xpath = "(//*[@class=\"property_block_title\"])[1]")
    public WebElement ilkMulkReview;

    // Share and Wislhlist Button / Paylasma ve ekleme butonu ilk mulk icin
    @FindBy(xpath = "(//*[@href=\"JavaScript:void(0);\"])")
    public WebElement ilkMulkShare;

    @FindBy(xpath = "(//*[@class=\"lni-facebook\"])")
    public WebElement ilkMulkFacebookShare;

    @FindBy(xpath = "(//*[@href=\"https://twitter.com/intent/tweet?url=https%3A%2F%2Fhauseheaven.com%2Fproperties%2F2468-pine-street-1&text=Live in the heart of the Big Apple in this spacious 3-bedroom, 2-bathroom apartment located in New York City. With 1500 square feet of living space on one level, this apartment offers a comfortable and convenient lifestyle.\"])")
    public WebElement ilkMulkTweetShare;

    @FindBy(xpath = "(//*[@href=\"https://linkedin.com/shareArticle?mini=true&url=https%3A%2F%2Fhauseheaven.com%2Fproperties%2F2468-pine-street-1&summary=Live in the heart of the Big Apple in this spacious 3-bedroom, 2-bathroom apartment located in New York City. With 1500 square feet of living space on one level, this apartment offers a comfortable and convenient lifestyle.&source=Linkedin\"])")
    public WebElement ilkMulkLinkedinShare;
    @FindBy(xpath = "(//*[@href=\"JavaScript:Void(0);\"])")
    public WebElement wishListButton;

    @FindBy(xpath = "(//*[@name=\"phone\"])")
    public WebElement ikinciPhoneTextBox;

    @FindBy(xpath = "(//*[@name=\"email\"])[1]")
    public WebElement ikinciemailTextBox;

    @FindBy(xpath = "(//*[@name=\"content\"])[1]")
    public WebElement ikincimessageTextBox;

    @FindBy(xpath = "//div[@class=\"alert alert-success alert-dismissible\"]")
    public WebElement wishlistSuccesAlert;

    @FindBy(xpath = "//button[text()='Send Message']")
    public WebElement sendMessageButton;

    @FindBy(xpath = "//div[@class=\"alert alert-success alert-dismissible\"]")
    public WebElement succesSendMessage;





}

















