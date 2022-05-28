/*
 * This file is generated by jOOQ.
*/
package com.unchartedpartners.databases;


import com.unchartedpartners.databases.tables.Account;
import com.unchartedpartners.databases.tables.AccountPerson;
import com.unchartedpartners.databases.tables.AccountProduct;
import com.unchartedpartners.databases.tables.BannerFile;
import com.unchartedpartners.databases.tables.BatchTask;
import com.unchartedpartners.databases.tables.ChangeFormApp;
import com.unchartedpartners.databases.tables.ChangeFormAppFile;
import com.unchartedpartners.databases.tables.Claim;
import com.unchartedpartners.databases.tables.ClaimFile;
import com.unchartedpartners.databases.tables.ClaimUploadHistory;
import com.unchartedpartners.databases.tables.Client;
import com.unchartedpartners.databases.tables.ClientPolicy;
import com.unchartedpartners.databases.tables.Clinic;
import com.unchartedpartners.databases.tables.CloudGaAgntpf;
import com.unchartedpartners.databases.tables.CloudGaCasepf;
import com.unchartedpartners.databases.tables.CloudGaChdrpf;
import com.unchartedpartners.databases.tables.CloudGaClexpf;
import com.unchartedpartners.databases.tables.CloudGaClntpf;
import com.unchartedpartners.databases.tables.CloudGaGchipf;
import com.unchartedpartners.databases.tables.CloudGaGclhpf;
import com.unchartedpartners.databases.tables.CloudGaGflppf;
import com.unchartedpartners.databases.tables.CloudGaGlhdpf;
import com.unchartedpartners.databases.tables.CloudGaGmhdpf;
import com.unchartedpartners.databases.tables.CloudGaGmhipf;
import com.unchartedpartners.databases.tables.CloudGaGphdpf;
import com.unchartedpartners.databases.tables.CloudGaGpmdpf;
import com.unchartedpartners.databases.tables.CloudGaGxhipf;
import com.unchartedpartners.databases.tables.CloudGaItempf;
import com.unchartedpartners.databases.tables.CloudGaZathpf;
import com.unchartedpartners.databases.tables.CloudGaZatrpf;
import com.unchartedpartners.databases.tables.CloudGaZtxtpf;
import com.unchartedpartners.databases.tables.CloudGroupAsiaClaimStaging;
import com.unchartedpartners.databases.tables.CloudGroupAsiaStaging;
import com.unchartedpartners.databases.tables.Company;
import com.unchartedpartners.databases.tables.CompanyContact;
import com.unchartedpartners.databases.tables.ContractDetails;
import com.unchartedpartners.databases.tables.ContractHeader;
import com.unchartedpartners.databases.tables.CredentialReq;
import com.unchartedpartners.databases.tables.DataFile;
import com.unchartedpartners.databases.tables.DocumentArchive;
import com.unchartedpartners.databases.tables.Enrolment;
import com.unchartedpartners.databases.tables.EnrolmentMember;
import com.unchartedpartners.databases.tables.EnrolmentReportView;
import com.unchartedpartners.databases.tables.ExtPaymentCodeMapping;
import com.unchartedpartners.databases.tables.GaAgntpf;
import com.unchartedpartners.databases.tables.GaBabrpf;
import com.unchartedpartners.databases.tables.GaCasepf;
import com.unchartedpartners.databases.tables.GaChdrpf;
import com.unchartedpartners.databases.tables.GaClbapf;
import com.unchartedpartners.databases.tables.GaClexpf;
import com.unchartedpartners.databases.tables.GaClntpf;
import com.unchartedpartners.databases.tables.GaDcrbpf;
import com.unchartedpartners.databases.tables.GaDescpf;
import com.unchartedpartners.databases.tables.GaGchipf;
import com.unchartedpartners.databases.tables.GaGchppf;
import com.unchartedpartners.databases.tables.GaGclhpf;
import com.unchartedpartners.databases.tables.GaGflppf;
import com.unchartedpartners.databases.tables.GaGlhdpf;
import com.unchartedpartners.databases.tables.GaGmhdpf;
import com.unchartedpartners.databases.tables.GaGmhipf;
import com.unchartedpartners.databases.tables.GaGphdpf;
import com.unchartedpartners.databases.tables.GaGpmdpf;
import com.unchartedpartners.databases.tables.GaGxhipf;
import com.unchartedpartners.databases.tables.GaItempf;
import com.unchartedpartners.databases.tables.GaNetdpf;
import com.unchartedpartners.databases.tables.GaZathpf;
import com.unchartedpartners.databases.tables.GaZatrpf;
import com.unchartedpartners.databases.tables.GaZgchpf;
import com.unchartedpartners.databases.tables.GaZrejpf;
import com.unchartedpartners.databases.tables.GaZtxtpf;
import com.unchartedpartners.databases.tables.GroupAsiaClaimStaging;
import com.unchartedpartners.databases.tables.GroupAsiaNo;
import com.unchartedpartners.databases.tables.GroupAsiaStaging;
import com.unchartedpartners.databases.tables.HdfSubmission;
import com.unchartedpartners.databases.tables.HealthDeclaration;
import com.unchartedpartners.databases.tables.KofaxDocumentSignStatus;
import com.unchartedpartners.databases.tables.MemberActConfig;
import com.unchartedpartners.databases.tables.MemberActStaging;
import com.unchartedpartners.databases.tables.MemberActStagingStatus;
import com.unchartedpartners.databases.tables.OccupationClassMaster;
import com.unchartedpartners.databases.tables.Partner;
import com.unchartedpartners.databases.tables.PaymentTransaction;
import com.unchartedpartners.databases.tables.PceEmulateLogin;
import com.unchartedpartners.databases.tables.PcePolicyImport;
import com.unchartedpartners.databases.tables.Person;
import com.unchartedpartners.databases.tables.PersonTc;
import com.unchartedpartners.databases.tables.Policy;
import com.unchartedpartners.databases.tables.PolicyMember;
import com.unchartedpartners.databases.tables.Product;
import com.unchartedpartners.databases.tables.ProductCurrent;
import com.unchartedpartners.databases.tables.PromoCodes;
import com.unchartedpartners.databases.tables.PulseClaimStatusNotificationHistory;
import com.unchartedpartners.databases.tables.Quote;
import com.unchartedpartners.databases.tables.QuoteCompany;
import com.unchartedpartners.databases.tables.QuoteCompanyContact;
import com.unchartedpartners.databases.tables.QuoteFile;
import com.unchartedpartners.databases.tables.ReportView;
import com.unchartedpartners.databases.tables.Subscription;
import com.unchartedpartners.databases.tables.SubscriptionFile;
import com.unchartedpartners.databases.tables.SubscriptionQuote;
import com.unchartedpartners.databases.tables.VasPromoCodesTxnTable;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in intest
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>intest.account</code>.
     */
    public static final Account ACCOUNT = com.unchartedpartners.databases.tables.Account.ACCOUNT;

    /**
     * The table <code>intest.account_person</code>.
     */
    public static final AccountPerson ACCOUNT_PERSON = com.unchartedpartners.databases.tables.AccountPerson.ACCOUNT_PERSON;

    /**
     * The table <code>intest.account_product</code>.
     */
    public static final AccountProduct ACCOUNT_PRODUCT = com.unchartedpartners.databases.tables.AccountProduct.ACCOUNT_PRODUCT;

    /**
     * The table <code>intest.banner_file</code>.
     */
    public static final BannerFile BANNER_FILE = com.unchartedpartners.databases.tables.BannerFile.BANNER_FILE;

    /**
     * The table <code>intest.batch_task</code>.
     */
    public static final BatchTask BATCH_TASK = com.unchartedpartners.databases.tables.BatchTask.BATCH_TASK;

    /**
     * The table <code>intest.change_form_app</code>.
     */
    public static final ChangeFormApp CHANGE_FORM_APP = com.unchartedpartners.databases.tables.ChangeFormApp.CHANGE_FORM_APP;

    /**
     * The table <code>intest.change_form_app_file</code>.
     */
    public static final ChangeFormAppFile CHANGE_FORM_APP_FILE = com.unchartedpartners.databases.tables.ChangeFormAppFile.CHANGE_FORM_APP_FILE;

    /**
     * The table <code>intest.claim</code>.
     */
    public static final Claim CLAIM = com.unchartedpartners.databases.tables.Claim.CLAIM;

    /**
     * The table <code>intest.claim_file</code>.
     */
    public static final ClaimFile CLAIM_FILE = com.unchartedpartners.databases.tables.ClaimFile.CLAIM_FILE;

    /**
     * The table <code>intest.claim_upload_history</code>.
     */
    public static final ClaimUploadHistory CLAIM_UPLOAD_HISTORY = com.unchartedpartners.databases.tables.ClaimUploadHistory.CLAIM_UPLOAD_HISTORY;

    /**
     * The table <code>intest.client</code>.
     */
    public static final Client CLIENT = com.unchartedpartners.databases.tables.Client.CLIENT;

    /**
     * The table <code>intest.client_policy</code>.
     */
    public static final ClientPolicy CLIENT_POLICY = com.unchartedpartners.databases.tables.ClientPolicy.CLIENT_POLICY;

    /**
     * The table <code>intest.clinic</code>.
     */
    public static final Clinic CLINIC = com.unchartedpartners.databases.tables.Clinic.CLINIC;

    /**
     * The table <code>intest.cloud_ga_agntpf</code>.
     */
    public static final CloudGaAgntpf CLOUD_GA_AGNTPF = com.unchartedpartners.databases.tables.CloudGaAgntpf.CLOUD_GA_AGNTPF;

    /**
     * The table <code>intest.cloud_ga_casepf</code>.
     */
    public static final CloudGaCasepf CLOUD_GA_CASEPF = com.unchartedpartners.databases.tables.CloudGaCasepf.CLOUD_GA_CASEPF;

    /**
     * The table <code>intest.cloud_ga_chdrpf</code>.
     */
    public static final CloudGaChdrpf CLOUD_GA_CHDRPF = com.unchartedpartners.databases.tables.CloudGaChdrpf.CLOUD_GA_CHDRPF;

    /**
     * The table <code>intest.cloud_ga_clexpf</code>.
     */
    public static final CloudGaClexpf CLOUD_GA_CLEXPF = com.unchartedpartners.databases.tables.CloudGaClexpf.CLOUD_GA_CLEXPF;

    /**
     * The table <code>intest.cloud_ga_clntpf</code>.
     */
    public static final CloudGaClntpf CLOUD_GA_CLNTPF = com.unchartedpartners.databases.tables.CloudGaClntpf.CLOUD_GA_CLNTPF;

    /**
     * The table <code>intest.cloud_ga_gchipf</code>.
     */
    public static final CloudGaGchipf CLOUD_GA_GCHIPF = com.unchartedpartners.databases.tables.CloudGaGchipf.CLOUD_GA_GCHIPF;

    /**
     * The table <code>intest.cloud_ga_gclhpf</code>.
     */
    public static final CloudGaGclhpf CLOUD_GA_GCLHPF = com.unchartedpartners.databases.tables.CloudGaGclhpf.CLOUD_GA_GCLHPF;

    /**
     * The table <code>intest.cloud_ga_gflppf</code>.
     */
    public static final CloudGaGflppf CLOUD_GA_GFLPPF = com.unchartedpartners.databases.tables.CloudGaGflppf.CLOUD_GA_GFLPPF;

    /**
     * The table <code>intest.cloud_ga_glhdpf</code>.
     */
    public static final CloudGaGlhdpf CLOUD_GA_GLHDPF = com.unchartedpartners.databases.tables.CloudGaGlhdpf.CLOUD_GA_GLHDPF;

    /**
     * The table <code>intest.cloud_ga_gmhdpf</code>.
     */
    public static final CloudGaGmhdpf CLOUD_GA_GMHDPF = com.unchartedpartners.databases.tables.CloudGaGmhdpf.CLOUD_GA_GMHDPF;

    /**
     * The table <code>intest.cloud_ga_gmhipf</code>.
     */
    public static final CloudGaGmhipf CLOUD_GA_GMHIPF = com.unchartedpartners.databases.tables.CloudGaGmhipf.CLOUD_GA_GMHIPF;

    /**
     * The table <code>intest.cloud_ga_gphdpf</code>.
     */
    public static final CloudGaGphdpf CLOUD_GA_GPHDPF = com.unchartedpartners.databases.tables.CloudGaGphdpf.CLOUD_GA_GPHDPF;

    /**
     * The table <code>intest.cloud_ga_gpmdpf</code>.
     */
    public static final CloudGaGpmdpf CLOUD_GA_GPMDPF = com.unchartedpartners.databases.tables.CloudGaGpmdpf.CLOUD_GA_GPMDPF;

    /**
     * The table <code>intest.cloud_ga_gxhipf</code>.
     */
    public static final CloudGaGxhipf CLOUD_GA_GXHIPF = com.unchartedpartners.databases.tables.CloudGaGxhipf.CLOUD_GA_GXHIPF;

    /**
     * The table <code>intest.cloud_ga_itempf</code>.
     */
    public static final CloudGaItempf CLOUD_GA_ITEMPF = com.unchartedpartners.databases.tables.CloudGaItempf.CLOUD_GA_ITEMPF;

    /**
     * The table <code>intest.cloud_ga_zathpf</code>.
     */
    public static final CloudGaZathpf CLOUD_GA_ZATHPF = com.unchartedpartners.databases.tables.CloudGaZathpf.CLOUD_GA_ZATHPF;

    /**
     * The table <code>intest.cloud_ga_zatrpf</code>.
     */
    public static final CloudGaZatrpf CLOUD_GA_ZATRPF = com.unchartedpartners.databases.tables.CloudGaZatrpf.CLOUD_GA_ZATRPF;

    /**
     * The table <code>intest.cloud_ga_ztxtpf</code>.
     */
    public static final CloudGaZtxtpf CLOUD_GA_ZTXTPF = com.unchartedpartners.databases.tables.CloudGaZtxtpf.CLOUD_GA_ZTXTPF;

    /**
     * The table <code>intest.cloud_group_asia_claim_staging</code>.
     */
    public static final CloudGroupAsiaClaimStaging CLOUD_GROUP_ASIA_CLAIM_STAGING = com.unchartedpartners.databases.tables.CloudGroupAsiaClaimStaging.CLOUD_GROUP_ASIA_CLAIM_STAGING;

    /**
     * The table <code>intest.cloud_group_asia_staging</code>.
     */
    public static final CloudGroupAsiaStaging CLOUD_GROUP_ASIA_STAGING = com.unchartedpartners.databases.tables.CloudGroupAsiaStaging.CLOUD_GROUP_ASIA_STAGING;

    /**
     * The table <code>intest.company</code>.
     */
    public static final Company COMPANY = com.unchartedpartners.databases.tables.Company.COMPANY;

    /**
     * The table <code>intest.company_contact</code>.
     */
    public static final CompanyContact COMPANY_CONTACT = com.unchartedpartners.databases.tables.CompanyContact.COMPANY_CONTACT;

    /**
     * The table <code>intest.contract_details</code>.
     */
    public static final ContractDetails CONTRACT_DETAILS = com.unchartedpartners.databases.tables.ContractDetails.CONTRACT_DETAILS;

    /**
     * The table <code>intest.contract_header</code>.
     */
    public static final ContractHeader CONTRACT_HEADER = com.unchartedpartners.databases.tables.ContractHeader.CONTRACT_HEADER;

    /**
     * The table <code>intest.credential_req</code>.
     */
    public static final CredentialReq CREDENTIAL_REQ = com.unchartedpartners.databases.tables.CredentialReq.CREDENTIAL_REQ;

    /**
     * The table <code>intest.data_file</code>.
     */
    public static final DataFile DATA_FILE = com.unchartedpartners.databases.tables.DataFile.DATA_FILE;

    /**
     * The table <code>intest.document_archive</code>.
     */
    public static final DocumentArchive DOCUMENT_ARCHIVE = com.unchartedpartners.databases.tables.DocumentArchive.DOCUMENT_ARCHIVE;

    /**
     * The table <code>intest.enrolment</code>.
     */
    public static final Enrolment ENROLMENT = com.unchartedpartners.databases.tables.Enrolment.ENROLMENT;

    /**
     * The table <code>intest.enrolment_member</code>.
     */
    public static final EnrolmentMember ENROLMENT_MEMBER = com.unchartedpartners.databases.tables.EnrolmentMember.ENROLMENT_MEMBER;

    /**
     * The table <code>intest.enrolment_report_view</code>.
     */
    public static final EnrolmentReportView ENROLMENT_REPORT_VIEW = com.unchartedpartners.databases.tables.EnrolmentReportView.ENROLMENT_REPORT_VIEW;

    /**
     * The table <code>intest.ext_payment_code_mapping</code>.
     */
    public static final ExtPaymentCodeMapping EXT_PAYMENT_CODE_MAPPING = com.unchartedpartners.databases.tables.ExtPaymentCodeMapping.EXT_PAYMENT_CODE_MAPPING;

    /**
     * The table <code>intest.ga_agntpf</code>.
     */
    public static final GaAgntpf GA_AGNTPF = com.unchartedpartners.databases.tables.GaAgntpf.GA_AGNTPF;

    /**
     * The table <code>intest.ga_babrpf</code>.
     */
    public static final GaBabrpf GA_BABRPF = com.unchartedpartners.databases.tables.GaBabrpf.GA_BABRPF;

    /**
     * The table <code>intest.ga_casepf</code>.
     */
    public static final GaCasepf GA_CASEPF = com.unchartedpartners.databases.tables.GaCasepf.GA_CASEPF;

    /**
     * The table <code>intest.ga_chdrpf</code>.
     */
    public static final GaChdrpf GA_CHDRPF = com.unchartedpartners.databases.tables.GaChdrpf.GA_CHDRPF;

    /**
     * The table <code>intest.ga_clbapf</code>.
     */
    public static final GaClbapf GA_CLBAPF = com.unchartedpartners.databases.tables.GaClbapf.GA_CLBAPF;

    /**
     * The table <code>intest.ga_clexpf</code>.
     */
    public static final GaClexpf GA_CLEXPF = com.unchartedpartners.databases.tables.GaClexpf.GA_CLEXPF;

    /**
     * The table <code>intest.ga_clntpf</code>.
     */
    public static final GaClntpf GA_CLNTPF = com.unchartedpartners.databases.tables.GaClntpf.GA_CLNTPF;

    /**
     * The table <code>intest.ga_dcrbpf</code>.
     */
    public static final GaDcrbpf GA_DCRBPF = com.unchartedpartners.databases.tables.GaDcrbpf.GA_DCRBPF;

    /**
     * The table <code>intest.ga_descpf</code>.
     */
    public static final GaDescpf GA_DESCPF = com.unchartedpartners.databases.tables.GaDescpf.GA_DESCPF;

    /**
     * The table <code>intest.ga_gchipf</code>.
     */
    public static final GaGchipf GA_GCHIPF = com.unchartedpartners.databases.tables.GaGchipf.GA_GCHIPF;

    /**
     * The table <code>intest.ga_gchppf</code>.
     */
    public static final GaGchppf GA_GCHPPF = com.unchartedpartners.databases.tables.GaGchppf.GA_GCHPPF;

    /**
     * The table <code>intest.ga_gclhpf</code>.
     */
    public static final GaGclhpf GA_GCLHPF = com.unchartedpartners.databases.tables.GaGclhpf.GA_GCLHPF;

    /**
     * The table <code>intest.ga_gflppf</code>.
     */
    public static final GaGflppf GA_GFLPPF = com.unchartedpartners.databases.tables.GaGflppf.GA_GFLPPF;

    /**
     * The table <code>intest.ga_glhdpf</code>.
     */
    public static final GaGlhdpf GA_GLHDPF = com.unchartedpartners.databases.tables.GaGlhdpf.GA_GLHDPF;

    /**
     * The table <code>intest.ga_gmhdpf</code>.
     */
    public static final GaGmhdpf GA_GMHDPF = com.unchartedpartners.databases.tables.GaGmhdpf.GA_GMHDPF;

    /**
     * The table <code>intest.ga_gmhipf</code>.
     */
    public static final GaGmhipf GA_GMHIPF = com.unchartedpartners.databases.tables.GaGmhipf.GA_GMHIPF;

    /**
     * The table <code>intest.ga_gphdpf</code>.
     */
    public static final GaGphdpf GA_GPHDPF = com.unchartedpartners.databases.tables.GaGphdpf.GA_GPHDPF;

    /**
     * The table <code>intest.ga_gpmdpf</code>.
     */
    public static final GaGpmdpf GA_GPMDPF = com.unchartedpartners.databases.tables.GaGpmdpf.GA_GPMDPF;

    /**
     * The table <code>intest.ga_gxhipf</code>.
     */
    public static final GaGxhipf GA_GXHIPF = com.unchartedpartners.databases.tables.GaGxhipf.GA_GXHIPF;

    /**
     * The table <code>intest.ga_itempf</code>.
     */
    public static final GaItempf GA_ITEMPF = com.unchartedpartners.databases.tables.GaItempf.GA_ITEMPF;

    /**
     * The table <code>intest.ga_netdpf</code>.
     */
    public static final GaNetdpf GA_NETDPF = com.unchartedpartners.databases.tables.GaNetdpf.GA_NETDPF;

    /**
     * The table <code>intest.ga_zathpf</code>.
     */
    public static final GaZathpf GA_ZATHPF = com.unchartedpartners.databases.tables.GaZathpf.GA_ZATHPF;

    /**
     * The table <code>intest.ga_zatrpf</code>.
     */
    public static final GaZatrpf GA_ZATRPF = com.unchartedpartners.databases.tables.GaZatrpf.GA_ZATRPF;

    /**
     * The table <code>intest.ga_zgchpf</code>.
     */
    public static final GaZgchpf GA_ZGCHPF = com.unchartedpartners.databases.tables.GaZgchpf.GA_ZGCHPF;

    /**
     * The table <code>intest.ga_zrejpf</code>.
     */
    public static final GaZrejpf GA_ZREJPF = com.unchartedpartners.databases.tables.GaZrejpf.GA_ZREJPF;

    /**
     * The table <code>intest.ga_ztxtpf</code>.
     */
    public static final GaZtxtpf GA_ZTXTPF = com.unchartedpartners.databases.tables.GaZtxtpf.GA_ZTXTPF;

    /**
     * The table <code>intest.group_asia_claim_staging</code>.
     */
    public static final GroupAsiaClaimStaging GROUP_ASIA_CLAIM_STAGING = com.unchartedpartners.databases.tables.GroupAsiaClaimStaging.GROUP_ASIA_CLAIM_STAGING;

    /**
     * The table <code>intest.group_asia_no</code>.
     */
    public static final GroupAsiaNo GROUP_ASIA_NO = com.unchartedpartners.databases.tables.GroupAsiaNo.GROUP_ASIA_NO;

    /**
     * The table <code>intest.group_asia_staging</code>.
     */
    public static final GroupAsiaStaging GROUP_ASIA_STAGING = com.unchartedpartners.databases.tables.GroupAsiaStaging.GROUP_ASIA_STAGING;

    /**
     * The table <code>intest.hdf_submission</code>.
     */
    public static final HdfSubmission HDF_SUBMISSION = com.unchartedpartners.databases.tables.HdfSubmission.HDF_SUBMISSION;

    /**
     * The table <code>intest.health_declaration</code>.
     */
    public static final HealthDeclaration HEALTH_DECLARATION = com.unchartedpartners.databases.tables.HealthDeclaration.HEALTH_DECLARATION;

    /**
     * The table <code>intest.kofax_document_sign_status</code>.
     */
    public static final KofaxDocumentSignStatus KOFAX_DOCUMENT_SIGN_STATUS = com.unchartedpartners.databases.tables.KofaxDocumentSignStatus.KOFAX_DOCUMENT_SIGN_STATUS;

    /**
     * The table <code>intest.member_act_config</code>.
     */
    public static final MemberActConfig MEMBER_ACT_CONFIG = com.unchartedpartners.databases.tables.MemberActConfig.MEMBER_ACT_CONFIG;

    /**
     * The table <code>intest.member_act_staging</code>.
     */
    public static final MemberActStaging MEMBER_ACT_STAGING = com.unchartedpartners.databases.tables.MemberActStaging.MEMBER_ACT_STAGING;

    /**
     * The table <code>intest.member_act_staging_status</code>.
     */
    public static final MemberActStagingStatus MEMBER_ACT_STAGING_STATUS = com.unchartedpartners.databases.tables.MemberActStagingStatus.MEMBER_ACT_STAGING_STATUS;

    /**
     * The table <code>intest.occupation_class_master</code>.
     */
    public static final OccupationClassMaster OCCUPATION_CLASS_MASTER = com.unchartedpartners.databases.tables.OccupationClassMaster.OCCUPATION_CLASS_MASTER;

    /**
     * The table <code>intest.partner</code>.
     */
    public static final Partner PARTNER = com.unchartedpartners.databases.tables.Partner.PARTNER;

    /**
     * The table <code>intest.payment_transaction</code>.
     */
    public static final PaymentTransaction PAYMENT_TRANSACTION = com.unchartedpartners.databases.tables.PaymentTransaction.PAYMENT_TRANSACTION;

    /**
     * The table <code>intest.pce_emulate_login</code>.
     */
    public static final PceEmulateLogin PCE_EMULATE_LOGIN = com.unchartedpartners.databases.tables.PceEmulateLogin.PCE_EMULATE_LOGIN;

    /**
     * The table <code>intest.pce_policy_import</code>.
     */
    public static final PcePolicyImport PCE_POLICY_IMPORT = com.unchartedpartners.databases.tables.PcePolicyImport.PCE_POLICY_IMPORT;

    /**
     * The table <code>intest.person</code>.
     */
    public static final Person PERSON = com.unchartedpartners.databases.tables.Person.PERSON;

    /**
     * The table <code>intest.person_tc</code>.
     */
    public static final PersonTc PERSON_TC = com.unchartedpartners.databases.tables.PersonTc.PERSON_TC;

    /**
     * The table <code>intest.policy</code>.
     */
    public static final Policy POLICY = com.unchartedpartners.databases.tables.Policy.POLICY;

    /**
     * The table <code>intest.policy_member</code>.
     */
    public static final PolicyMember POLICY_MEMBER = com.unchartedpartners.databases.tables.PolicyMember.POLICY_MEMBER;

    /**
     * The table <code>intest.product</code>.
     */
    public static final Product PRODUCT = com.unchartedpartners.databases.tables.Product.PRODUCT;

    /**
     * The table <code>intest.product_current</code>.
     */
    public static final ProductCurrent PRODUCT_CURRENT = com.unchartedpartners.databases.tables.ProductCurrent.PRODUCT_CURRENT;

    /**
     * The table <code>intest.promo_codes</code>.
     */
    public static final PromoCodes PROMO_CODES = com.unchartedpartners.databases.tables.PromoCodes.PROMO_CODES;

    /**
     * The table <code>intest.pulse_claim_status_notification_history</code>.
     */
    public static final PulseClaimStatusNotificationHistory PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY = com.unchartedpartners.databases.tables.PulseClaimStatusNotificationHistory.PULSE_CLAIM_STATUS_NOTIFICATION_HISTORY;

    /**
     * The table <code>intest.quote</code>.
     */
    public static final Quote QUOTE = com.unchartedpartners.databases.tables.Quote.QUOTE;

    /**
     * The table <code>intest.quote_company</code>.
     */
    public static final QuoteCompany QUOTE_COMPANY = com.unchartedpartners.databases.tables.QuoteCompany.QUOTE_COMPANY;

    /**
     * The table <code>intest.quote_company_contact</code>.
     */
    public static final QuoteCompanyContact QUOTE_COMPANY_CONTACT = com.unchartedpartners.databases.tables.QuoteCompanyContact.QUOTE_COMPANY_CONTACT;

    /**
     * The table <code>intest.quote_file</code>.
     */
    public static final QuoteFile QUOTE_FILE = com.unchartedpartners.databases.tables.QuoteFile.QUOTE_FILE;

    /**
     * The table <code>intest.report_view</code>.
     */
    public static final ReportView REPORT_VIEW = com.unchartedpartners.databases.tables.ReportView.REPORT_VIEW;

    /**
     * The table <code>intest.subscription</code>.
     */
    public static final Subscription SUBSCRIPTION = com.unchartedpartners.databases.tables.Subscription.SUBSCRIPTION;

    /**
     * The table <code>intest.subscription_file</code>.
     */
    public static final SubscriptionFile SUBSCRIPTION_FILE = com.unchartedpartners.databases.tables.SubscriptionFile.SUBSCRIPTION_FILE;

    /**
     * The table <code>intest.subscription_quote</code>.
     */
    public static final SubscriptionQuote SUBSCRIPTION_QUOTE = com.unchartedpartners.databases.tables.SubscriptionQuote.SUBSCRIPTION_QUOTE;

    /**
     * The table <code>intest.vas_promo_codes_txn_table</code>.
     */
    public static final VasPromoCodesTxnTable VAS_PROMO_CODES_TXN_TABLE = com.unchartedpartners.databases.tables.VasPromoCodesTxnTable.VAS_PROMO_CODES_TXN_TABLE;
}
