/**
 * Copyright � 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.elm.model;

import com.dell.isg.smi.commons.elm.messaging.IMessageEnum;

public enum EnumErrorCode implements IMessageEnum {
    /*
     * ENUM_PROFILE_TYPE_INVALID("ENUM_PROFILE_TYPE_INVALID",220001), ENUM_CREDENTIAL_TYPE_INVALID("ENUM_CREDENTIAL_TYPE_INVALID",220002),
     * ENUM_CREDENTIAL_INVALID("ENUM_CREDENTIAL_INVALID",220003), ENUM_CREDENTIAL_SAVE_ERROR("ENUM_CREDENTIAL_SAVE_ERROR",220004),
     * ENUM_CONNECTION_CREDENTIAL_SAVE_ERROR("ENUM_CONNECTION_CREDENTIAL_SAVE_ERROR",220005),
     * ENUM_NO_CONNECTION_PROFILE_PROFILE_ERROR("ENUM_NO_CONNECTION_PROFILE_PROFILE_ERROR",220006),
     * ENUM_CONNECTION_PROFILE_FETCH_ERROR("ENUM_CONNECTION_PROFILE_FETCH_ERROR",220007), CHASSIS_IP_INVALID("CHASSIS_IP_INVALID",260001),
     * CHASSIS_SERVICETAG_INVALID("CHASSIS_SERVICETAG_INVALID",260002), CHASSIS_ADAPTER_COMMAND_FAILED("CHASSIS_ADAPTER_COMMAND_FAILED",260003),
     * SERVER_ADAPTER_COMMAND_FAILED("SERVER_ADAPTER_COMMAND_FAILED",270001), SWITCH_PORT_SUMMARY_FAILED("SWITCH_PORT_SUMMARY_FAILED",250001),
     * FABRIC_DETAILS_FAILED("FABRIC_DETAILS_FAILED",250002), SWITCH_DETAILS_FAILED("SWITCH_DETAILS_FAILED",250003),
     * CONFIGURE_FABRIC_UPLINKS_FAILED("CONFIGURE_FABRIC_UPLINKS_FAILED",250004), UPDATE_FABRIC_UPLINKS_FAILED("UPDATE_FABRIC_UPLINKS_FAILED",250005),
     * DELETE_FABRIC_UPLINKS_FAILED("DELETE_FABRIC_UPLINKS_FAILED",250006), ENUM_UNKNOWN_ERROR("ENUM_UNKNOWN_ERROR",200001),
     * ENUM_AUTHORIZATION_ERROR("ENUM_AUTHORIZATION_ERROR",200003), ENUM_AUTHENTICATION_ERROR("ENUM_AUTHENTICATION_ERROR",200004),
     * ENUM_INVALIDINPUT_ERROR("ENUM_INVALIDINPUT_ERROR",200005), ENUM_UNSUPPORTEDOPERATION_ERROR("ENUM_UNSUPPORTEDOPERATION_ERROR",200006),
     * ENUM_INTERNAL_ERROR("ENUM_INTERNAL_ERROR",200007), ENUM_COMMUNICATION_ERROR("ENUM_COMMUNICATION_ERROR",200008), ENUM_LOCKED_ERROR("ENUM_LOCKED_ERROR",200009),
     * ENUM_UNKNOWN_ACCOUNT_ERROR("ENUM_UNKNOWN_ACCOUNT_ERROR",200010), ENUM_INCORRECT_CREDENTIALS_ERROR("ENUM_INCORRECT_CREDENTIALS_ERROR",200011),
     * ENUM_EXCESSIVE_ATTEMPTS_ERROR("ENUM_EXCESSIVE_ATTEMPTS_ERROR",200012), ENUM_INVALID_DATA_WITHOUT_PARAM_NAME("ENUM_INVALID_DATA_WITHOUT_PARAM_NAME",200013),
     * ENUM_LICENSE_EXPIRED("ENUM_LICENSE_EXPIRED",200014), ENUM_LICENSE_NOT_VALID("ENUM_LICENSE_NOT_VALID",200015),
     * ENUM_INPUT_EXCEEDED_MAXIMUM_LENGTH("ENUM_INPUT_EXCEEDED_MAXIMUM_LENGTH",200016), ENUM_INPUT_EXCEEDED_TOTAL("ENUM_INPUT_EXCEEDED_TOTAL",200017),
     * ENUM_BAD_REQUEST_ERROR("ENUM_BAD_REQUEST_ERROR",200400), ENUM_NOT_FOUND_ERROR("ENUM_NOT_FOUND_ERROR",200404), ENUM_CONFLICT("ENUM_CONFLICT",200409),
     * ENUM_NOT_FOUND_DEVICE_STATE_ERROR("ENUM_NOT_FOUND_DEVICE_STATE_ERROR",201404), ENUM_NOT_FOUND_DEVICE_STATUS_ERROR("ENUM_NOT_FOUND_DEVICE_STATUS_ERROR",201409),
     * ENUM_TOO_MANY_REQUESTS("ENUM_TOO_MANY_REQUESTS",200429), ENUM_SERVER_ERROR("ENUM_SERVER_ERROR",200500), INVALID_NEGATIVE_INPUT("INVALID_NEGATIVE_INPUT",200501),
     * ENUM_PERMISSION_ERROR("ENUM_PERMISSION_ERROR",200502), NO_RECORD_FOUND("NO_RECORD_FOUND",230001), IOPOOL_DELETE_NOT_ALLOWED("IOPOOL_DELETE_NOT_ALLOWED",230002),
     * IOPOOL_DELETE_FAILED("IOPOOL_DELETE_FAILED",230003), IOPOOL_SPECIFIED_INVALID("IOPOOL_SPECIFIED_INVALID",230005),
     * IOPOOL_UPDATE_NOT_ALLOWED("IOPOOL_UPDATE_NOT_ALLOWED",230006), IOPOOL_EXISTS("IOPOOL_EXISTS",230008), IOPOOL_SAVE_FAILED("IOPOOL_SAVE_FAILED",230009),
     * IOPOOL_GET_FAILED("IOPOOL_GET_FAILED",230010), NO_RECORDS_FOUND("NO_RECORDS_FOUND",230011),
     * IOPOOL_INVALID_IOPOOL_OR_ID_FOR_UPDATE("IOPOOL_INVALID_IOPOOL_OR_ID_FOR_UPDATE",230015), NO_RECORD_FOUND_FOR_TYPE("NO_RECORD_FOUND_FOR_TYPE",230016),
     * IOPOOL_TYPES_INVALID("IOPOOL_TYPES_INVALID",230017), IOIDENTITY_TO_BE_CREATED_OUT_OF_RANGE("IOIDENTITY_TO_BE_CREATED_OUT_OF_RANGE",231001),
     * IOIDENTITY_RESERVATIONS_EXCEEDED("IOIDENTITY_RESERVATIONS_EXCEEDED",231002), IOIDENTITY_GENERATION_FAILED("IOIDENTITY_GENERATION_FAILED",231003),
     * IOIDENTITY_GENERATION_INVALID_STARTNUMBER("IOIDENTITY_GENERATION_INVALID_STARTNUMBER",231004),
     * IOIDENTITY_GENERATION_EXCEED_MAXLENGTH("IOIDENTITY_GENERATION_EXCEED_MAXLENGTH",231005),
     * IOIDENTITY_GENERATION_MISMATCH_PATTERN("IOIDENTITY_GENERATION_MISMATCH_PATTERN",231006),
     * IOIDENTITY_GENERATION_OVERLARGE_STARTPOINT("IOIDENTITY_GENERATION_OVERLARGE_STARTPOINT",231007),
     * IOIDENTITY_GENERATION_DATABASE_VIOLATION("IOIDENTITY_GENERATION_DATABASE_VIOLATION",231008), IOIDENTITY_GENERATION_INVALID_EUI("IOIDENTITY_GENERATION_INVALID_EUI",231009),
     * CANNOT_RETRIEVE_DATA("CANNOT_RETRIEVE_DATA",231011), IOIDENTITY_INVALID_TYPE_IN_POOL("IOIDENTITY_INVALID_TYPE_IN_POOL",231012),
     * IOIDENTITY_INVALID_NUMBER_OF_ID_TO_CREATE("IOIDENTITY_INVALID_NUMBER_OF_ID_TO_CREATE",231013), IOIDENTITY_INVALID_CREATE_REQUEST("IOIDENTITY_INVALID_CREATE_REQUEST",231014),
     * IOIDENTITY_FAILED_TO_RESERVE_IDENTITIES("IOIDENTITY_FAILED_TO_RESERVE_IDENTITIES",231015),
     * IOIDENTITY_FAILED_TO_ASSIGN_IDENTITIES("IOIDENTITY_FAILED_TO_ASSIGN_IDENTITIES",231016),
     * IOIDENTITY_FAILED_TO_RELEASE_IDENTITIES("IOIDENTITY_FAILED_TO_RELEASE_IDENTITIES",231017), GENERAL_ERROR_IN_OPERATION("GENERAL_ERROR_IN_OPERATION",231018),
     * IOIDENTITY_CREATE_SUCCESS("IOIDENTITY_CREATE_SUCCESS",231019), IOIDENTITY_CREATE_FAILURE("IOIDENTITY_CREATE_FAILURE",231020),
     * IOIDENTITY_SPECIFIED_INVALID("IOIDENTITY_SPECIFIED_INVALID",231021), INVALID_IOIDENTITY_TYPE("INVALID_IOIDENTITY_TYPE",231022),
     * IOIDENTITY_TYPE_EXISTS_IOPOOL("IOIDENTITY_TYPE_EXISTS_IOPOOL",231023), IOIDENTITY_TO_BE_CREATED_INVALID("IOIDENTITY_TO_BE_CREATED_INVALID",231024),
     * INVALID_IOIDENTITY_PREFIX("INVALID_IOIDENTITY_PREFIX",231025), IOIDENTITY_PREFIX_INUSE("IOIDENTITY_PREFIX_INUSE",231026),
     * IOIDENTITY_CREATE_NOT_ALLOWED("IOIDENTITY_CREATE_NOT_ALLOWED",231027), IOIDENTITY_CREATE_OR_UPDATE_FAILED("IOIDENTITY_CREATE_OR_UPDATE_FAILED",231028),
     * IOIDENTITY_CREATE_SUCCESSFULL("IOIDENTITY_CREATE_SUCCESSFULL",231029), IOIDENTITY_UPDATE_SUCCESSFULL("IOIDENTITY_UPDATE_SUCCESSFULL",231030),
     * IOIDENTITY_INVALID_WWPN("IOIDENTITY_INVALID_WWPN",231031), IOIDENTITY_INVALID_WWNN("IOIDENTITY_INVALID_WWNN",231032),
     * IOPOOL_MAX_SIZE_EXCEEDED("IOPOOL_MAX_SIZE_EXCEEDED",231033), IOIDENTITY_INVALID_USAGE_ID("IOIDENTITY_INVALID_USAGE_ID",231034),
     * IOIDENTITY_INVALID_IDENTITY_ID("IOIDENTITY_INVALID_IDENTITY_ID",231035), IOIDENTITY_INVALID_INPUT("IOIDENTITY_INVALID_INPUT",231036),
     * IOIDENTITY_NOT_FOUND("IOIDENTITY_NOT_FOUND",231037), NETWORKCONF_SPECIFIED_INVALID("NETWORKCONF_SPECIFIED_INVALID",232001),
     * NETWORKCONF_SYSTEM_ERROR("NETWORKCONF_SYSTEM_ERROR",232002), NETWORKCONF_NAME_EXISTS("NETWORKCONF_NAME_EXISTS",232003),
     * NETWORKCONF_IPRANGE_NOTUNIQUE("NETWORKCONF_IPRANGE_NOTUNIQUE",232005), NETWORKCONF_CANNOT_BE_STATIC("NETWORKCONF_CANNOT_BE_STATIC",2322006),
     * NETWORKCONF_MUST_BE_STATIC("NETWORKCONF_MUST_BE_STATIC",232007), NETWORKCONF_NETWORK_MISMATCH("NETWORKCONF_NETWORK_MISMATCH",232008),
     * NETWORKCONF_IP_IN_USE("NETWORKCONF_IP_IN_USE",232009), NETWORKCONF_EMPTY_NETWORKNAME("NETWORKCONF_EMPTY_NETWORKNAME",232010),
     * NETWORKCONF_EMPTY_NETWORK_ID("NETWORKCONF_EMPTY_NETWORK_ID",232011), NETWORKCONF_VLANID_OUTOF_RANGE("NETWORKCONF_VLANID_OUTOF_RANGE",232012),
     * NETWORKCONF_INVALIDNETWORK_TYPE("NETWORKCONF_INVALIDNETWORK_TYPE",232013), NETWORKCONF_VLANID_CANOT_BE_NULL("NETWORKCONF_VLANID_CANOT_BE_NULL",232014),
     * NETWORKCONF_VLANID_MUST_BE_NULL("NETWORKCONF_VLANID_MUST_BE_NULL",232015), NETWORKCONF_IP_RANGE_LIMIT_EXCEEDED("NETWORKCONF_IP_RANGE_LIMIT_EXCEEDED",2322016),
     * NETWORKCONF_INVALID_NETWORK_CONF("NETWORKCONF_INVALID_NETWORK_CONF",232017), NETWORKCONF_IPADDRESS_TYPE_CHANGED("NETWORKCONF_IPADDRESS_TYPE_CHANGED",232018),
     * NETWORKCONF_NETWORK_OVERLAP("NETWORKCONF_NETWORK_OVERLAP",232019), INVALID_NETWORKCONF_OR_ID_FOR_UPDATE("INVALID_NETWORKCONF_OR_ID_FOR_UPDATE",232020),
     * NETWORKCONF_CREATE_SUCCESS("NETWORKCONF_CREATE_SUCCESS",232021), NETWORKCONF_UPDATE_SUCCESS("NETWORKCONF_UPDATE_SUCCESS",232022),
     * NETWORKCONF_DELETE_SUCCESS("NETWORKCONF_DELETE_SUCCESS",232023), NETWORKCONF_INVALID_IP_FOR_PRIMARY_DNS("NETWORKCONF_INVALID_IP_FOR_PRIMARY_DNS",232024),
     * NETWORKCONF_INVALID_IP_FOR_SECONDARY_DNS("NETWORKCONF_INVALID_IP_FOR_SECONDARY_DNS",232025),
     * NETWORKCONF_SAME_PRIMARY_SECONDARY_DNS("NETWORKCONF_SAME_PRIMARY_SECONDARY_DNS",232026), NETWORKCONF_EMPTY_GATEWAY("NETWORKCONF_EMPTY_GATEWAY",232027),
     * NETWORKCONF_INVALID_IP_FOR_GATEWAY("NETWORKCONF_INVALID_IP_FOR_GATEWAY",232028), NETWORKCONF_INVALID_DNS_SUFFIX("NETWORKCONF_INVALID_DNS_SUFFIX",232029),
     * NETWORKCONF_GATEWAY_SUBNET_IPRANGE_NOT_SAME("NETWORKCONF_GATEWAY_SUBNET_IPRANGE_NOT_SAME",232030), NETWORKCONF_INVALID_IPRANGE("NETWORKCONF_INVALID_IPRANGE",232031),
     * NETWORKCONF_OVERLAP_IPRANGE("NETWORKCONF_OVERLAP_IPRANGE",232032), NETWORKCONF_INVALID_IPRANGE_START_IP("NETWORKCONF_INVALID_IPRANGE_START_IP",232033),
     * NETWORKCONF_INVALID_IPRANGE_END_IP("NETWORKCONF_INVALID_IPRANGE_END_IP",232034), NETWORKCONF_INVALID_SUBNET_IP("NETWORKCONF_INVALID_SUBNET_IP",232035),
     * NETWORKCONF_IPRANGE_SAVE_OR_UPDATE_FAILED("NETWORKCONF_IPRANGE_SAVE_OR_UPDATE_FAILED",232036),
     * NETWORKCONF_IPRANGE_UPDATE_FAILED_IP_IN_USE("NETWORKCONF_IPRANGE_UPDATE_FAILED_IP_IN_USE",232037),
     * NETWORKCONF_IPRANGE_DELETE_FAILED("NETWORKCONF_IPRANGE_DELETE_FAILED",232038), NETWORKCONF_IPRANGE_NOT_FOUND("NETWORKCONF_IPRANGE_NOT_FOUND",232039),
     * NETWORKCONF_IPRANGE_RETRIEVE_FAILED("NETWORKCONF_IPRANGE_RETRIEVE_FAILED",232040), NETWORKCONF_UPDATE_IPRANGE_INCLUDED("NETWORKCONF_UPDATE_IPRANGE_INCLUDED",232041),
     * NETWORKCONF_CREATE_FAILED_IN_RA("NETWORKCONF_CREATE_FAILED_IN_RA",232042), NETWORKCONF_UPDATE_FAILED_IN_RA("NETWORKCONF_UPDATE_FAILED_IN_RA",232043),
     * NETWORKCONF_DELETE_FAILED_IN_RA("NETWORKCONF_DELETE_FAILED_IN_RA",232044),
     * NETWORKCONF_VLAN_ID_CREATE_OR_UPDATE_NOT_ALLOWED("NETWORKCONF_VLAN_ID_CREATE_OR_UPDATE_NOT_ALLOWED",232045),
     * NETWORKCONF_VLAN_ID_DELETE_NOT_ALLOWED("NETWORKCONF_VLAN_ID_DELETE_NOT_ALLOWED",232046), IPPOOL_INVALID_GUID("IPPOOL_INVALID_GUID",233001),
     * IPPOOL_INVALID_IPADRESS_COUNT("IPPOOL_INVALID_IPADRESS_COUNT",233002), IPPOOL_INVALID_IPADRESS_LIST("IPPOOL_INVALID_IPADRESS_LIST",233003),
     * IPPOOL_ENOUGH_IPADRESS_NOT_AVAILABLE("IPPOOL_ENOUGH_IPADRESS_NOT_AVAILABLE",233004), IPPOOL_IPADDRESS_NOTASSIGNABLE("IPPOOL_IPADDRESS_NOTASSIGNABLE",233005),
     * IPPOOL_IPADDRESS_ASSIGN_FAILED("IPPOOL_IPADDRESS_ASSIGN_FAILED",233006), IPPOOL_GET_OPERATION_FAILED("IPPOOL_GET_OPERATION_FAILED",233007),
     * IPPOOL_NO_IPADDRESS_AVAILABLE("IPPOOL_NO_IPADDRESS_AVAILABLE",233008), NETWORK_NAME_INVALID_RESERVED("NETWORK_NAME_INVALID_RESERVED",233009),
     * INVALID_NAME_LENGTH_CODE("INVALID_NAME_LENGTH_CODE",234001), INVALID_NAME_FORMAT_CODE("INVALID_NAME_FORMAT_CODE",234002),
     * INVALID_DESC_LENGTH_CODE("INVALID_DESC_LENGTH_CODE",234003), INVALID_DESC_FORMAT_CODE("INVALID_DESC_FORMAT_CODE",234004),
     * INVALID_DISPLAY_NAME_LENGTH_CODE("INVALID_DISPLAY_NAME_LENGTH_CODE",234015), INVALID_DISPLAY_NAME_FORMAT_CODE("INVALID_DISPLAY_NAME_FORMAT_CODE",234016),
     * INVALID_IPADDRESS_CODE("INVALID_IPADDRESS_CODE",234022), INVALID_IPRANGE_CODE("INVALID_IPRANGE_CODE",234024), INVALID_IPRANGE_SIZE_CODE("INVALID_IPRANGE_SIZE_CODE",234025),
     * USERNAME_MISSING("USERNAME_MISSING",700001), USERNAME_INVALID("USERNAME_INVALID",700002), PASSWORD_MISSING("PASSWORD_MISSING",700003),
     * PASSWORD_INVALID("PASSWORD_INVALID",700004), USERNAME_NOT_UNIQUE("USERNAME_NOT_UNIQUE",700005), INVALID_USERTYPE("INVALID_USERTYPE",700006),
     * ENUM_APPLIANCE_PASSWORD_INVALID("ENUM_APPLIANCE_PASSWORD_INVALID",210001),
     * ENUM_APPLIANCE_PASSWORD_CHANGE_UNKNOWN_ERROR("ENUM_APPLIANCE_PASSWORD_CHANGE_UNKNOWN_ERROR",210002),
     * ENUM_APPLIANCE_PASSWORD_UNSECURE("ENUM_APPLIANCE_PASSWORD_UNSECURE",210003), ENUM_APPLIANCE_HOSTNAME_GET_UNKNOWN_ERROR("ENUM_APPLIANCE_HOSTNAME_GET_UNKNOWN_ERROR",210010),
     * ENUM_APPLIANCE_HOSTNAME_CHANGE_UNKNOWN_ERROR("ENUM_APPLIANCE_HOSTNAME_CHANGE_UNKNOWN_ERROR",210011),
     * ENUM_APPLIANCE_CERTIFICATE_SIGNING_REQUEST_UNKNOWN_ERROR("ENUM_APPLIANCE_CERTIFICATE_SIGNING_REQUEST_UNKNOWN_ERROR",210020),
     * ENUM_APPLIANCE_TIMEZONE_GET_UNKNOWN_ERROR("ENUM_APPLIANCE_TIMEZONE_GET_UNKNOWN_ERROR",210030),
     * ENUM_APPLIANCE_TIMEZONES_GET_UNKNOWN_ERROR("ENUM_APPLIANCE_TIMEZONES_GET_UNKNOWN_ERROR",210031),
     * ENUM_APPLIANCE_TIMEZONE_CHANGE_UNKNOWN_ERROR("ENUM_APPLIANCE_TIMEZONE_CHANGE_UNKNOWN_ERROR",210032),
     * ENUM_NTP_SETTINGS_CONFIGURATION_PERSIST_ERROR("ENUM_NTP_SETTINGS_CONFIGURATION_PERSIST_ERROR",210033),
     * ENUM_APPLIANCE_SHUTDOWN_UNKNOWN_ERROR("ENUM_APPLIANCE_SHUTDOWN_UNKNOWN_ERROR",210040), ENUM_APPLIANCE_RESTART_UNKNOWN_ERROR("ENUM_APPLIANCE_RESTART_UNKNOWN_ERROR",210041),
     * ENUM_APPLIANCE_TROUBLESHOOTING_BUNDLE_ERROR("ENUM_APPLIANCE_TROUBLESHOOTING_BUNDLE_ERROR",210042),
     * ENUM_TENANT_ENTITY_ASSOCIATION_CREATION_FAILURE("ENUM_TENANT_ENTITY_ASSOCIATION_CREATION_FAILURE",210050),
     * ENUM_SYSLOGSETTINGS_CONFIGURATION_PERSIST_ERROR("ENUM_SYSLOGSETTINGS_CONFIGURATION_PERSIST_ERROR",210060),
     * ENUM_SNMPSETTINGS_NETWORK_SERVICE_PERSIST_ERROR("ENUM_SNMPSETTINGS_NETWORK_SERVICE_PERSIST_ERROR",210070),
     * ENUM_PROXYINFORMATION_CONFIGURATION_PERSIST_ERROR("ENUM_PROXYINFORMATION_CONFIGURATION_PERSIST_ERROR",210080),
     * ENUM_PROXYINFORMATION_TEST_ERROR_NO_HOST_DETAIL("ENUM_PROXYINFORMATION_TEST_ERROR_NO_HOST_DETAIL",210082), ENUM_GET_AUDIT_DATA_FAILURE("ENUM_GET_AUDIT_DATA_FAILURE",210090),
     * ENUM_SMTPSETTINGS_CONFIGURATION_PERSIST_ERROR("ENUM_SMTPSETTINGS_CONFIGURATION_PERSIST_ERROR",210100), ENUM_SMTPSETTINGS_TEST_ERROR("ENUM_SMTPSETTINGS_TEST_ERROR",210101),
     * ENUM_DATABASE_OBJECT_NOT_FOUND("ENUM_DATABASE_OBJECT_NOT_FOUND",210200),
     * STORAGE_CONTROLLER_PASSWORD_CHANGE_UNKNOWN_ERROR("STORAGE_CONTROLLER_PASSWORD_CHANGE_UNKNOWN_ERROR",240001), STORAGE_HOST_NOT_AVAILABLE("STORAGE_HOST_NOT_AVAILABLE",240002),
     * STORAGE_GET_CURRENT_USER_FAILED("STORAGE_GET_CURRENT_USER_FAILED",240003), STORAGE_NO_DISK_FOUND_ERROR("STORAGE_NO_DISK_FOUND_ERROR",240004),
     * STORAGE_CREATE_DISK_FAILED("STORAGE_CREATE_DISK_FAILED",240005), STORAGE_JOIN_CONTROLLER_FAILED("STORAGE_JOIN_CONTROLLER_FAILED",240006),
     * INVALID_STORAGEID_VOLUMEID_ASSOCIATION("INVALID_STORAGEID_VOLUMEID_ASSOCIATION",240007), STORAGE_NOT_FOUND("STORAGE_NOT_FOUND",240008),
     * STORAGE_GET_EM_USER_ERROR("STORAGE_GET_EM_USER_ERROR",240009), STORAGE_CHANGE_USER_CREDENTIAL_ERROR("STORAGE_CHANGE_USER_CREDENTIAL_ERROR",240010),
     * STORAGE_EULA_ACCEPTANCE_ERROR("STORAGE_EULA_ACCEPTANCE_ERROR",240011), STORAGE_CONFIGURE_TIMEZONE_ERROR("STORAGE_CONFIGURE_TIMEZONE_ERROR",240012),
     * STORAGE_NO_DISK_FOLDER_FOUND_ERROR("STORAGE_NO_DISK_FOLDER_FOUND_ERROR",240013), STORAGE_MANAGE_REMAINING_DISK_ERROR("STORAGE_MANAGE_REMAINING_DISK_ERROR",240014),
     * STORAGE_CONFIGURE_SNMP_TRAP_ERROR("STORAGE_CONFIGURE_SNMP_TRAP_ERROR",240015), STORAGE_GENERATE_SSL_CERTIFICATE_ERROR("STORAGE_GENERATE_SSL_CERTIFICATE_ERROR",240016),
     * STORAGE_CREATE_BACK_END_LOCAL_PORT_CONFIGURATION_ERROR("STORAGE_CREATE_BACK_END_LOCAL_PORT_CONFIGURATION_ERROR",240017),
     * STORAGE_CONFIGURE_CACHE_ERROR("STORAGE_CONFIGURE_CACHE_ERROR",240018), STORAGE_CONFIGURE_LOGGING_AND_UPDATE_ERROR("STORAGE_CONFIGURE_LOGGING_AND_UPDATE_ERROR",240019),
     * STORAGE_VOLUME_CREATE_ERROR("STORAGE_VOLUME_CREATE_ERROR",240020), STORAGE_VOLUME_GET_LIST_ERROR("STORAGE_VOLUME_GET_LIST_ERROR",240021),
     * STORAGE_VOLUME_GET_ERROR("STORAGE_VOLUME_GET_ERROR",240022), STORAGE_VOLUME_UPDATE_NAME_ERROR("STORAGE_VOLUME_UPDATE_NAME_ERROR",240023),
     * STORAGE_VOLUME_UPDATE_STORAGE_PROFILE_ERROR("STORAGE_VOLUME_UPDATE_STORAGE_PROFILE_ERROR",240024),
     * STORAGE_VOLUME_UPDATE_SIZE_ERROR("STORAGE_VOLUME_UPDATE_SIZE_ERROR",240025), STORAGE_VOLUME_DELETE_ERROR("STORAGE_VOLUME_DELETE_ERROR",240026),
     * STORAGE_VOLUME_NOT_FOUND("STORAGE_VOLUME_NOT_FOUND",240027), STORAGE_SNAPSHOT_CREATE_ERROR("STORAGE_SNAPSHOT_CREATE_ERROR",240028),
     * STORAGE_SNAPSHOT_GET_LIST_ERROR("STORAGE_SNAPSHOT_GET_LIST_ERROR",240029), STORAGE_SNAPSHOT_GET_ERROR("STORAGE_SNAPSHOT_GET_ERROR",240030),
     * STORAGE_SNAPSHOT_UPDATE_ERROR("STORAGE_SNAPSHOT_UPDATE_ERROR",240031), STORAGE_SNAPSHOT_DELETE_ERROR("STORAGE_SNAPSHOT_DELETE_ERROR",240032),
     * INVALID_VOLUMEID_SNAPSHOTID_ASSOCIATION("INVALID_VOLUMEID_SNAPSHOTID_ASSOCIATION",240033),
     * STORAGE_SNAPSHOT_CREATE_INACTIVE_ERROR("STORAGE_SNAPSHOT_CREATE_INACTIVE_ERROR",240034),
     * STORAGE_VOLUME_CREATE_FROM_SNAPSHOT_ERROR("STORAGE_VOLUME_CREATE_FROM_SNAPSHOT_ERROR",240035),
     * STORAGE_SNAPSHOT_SCHEDULE_CREATE_ERROR("STORAGE_SNAPSHOT_SCHEDULE_CREATE_ERROR",240036),
     * STORAGE_SNAPSHOT_SCHEDULE_UPDATE_ERROR("STORAGE_SNAPSHOT_SCHEDULE_UPDATE_ERROR",240037), STORAGE_SNAPSHOT_SCHEDULE_GET_ERROR("STORAGE_SNAPSHOT_SCHEDULE_GET_ERROR",240038),
     * STORAGE_SNAPSHOT_SCHEDULE_DELETE_ERROR("STORAGE_SNAPSHOT_SCHEDULE_DELETE_ERROR",240039), INVALID_SNAPSHOT_SCHEDULE_START_TIME("INVALID_SNAPSHOT_SCHEDULE_START_TIME",240040),
     * MISSING_MANDATORY_INPUT_FIELD("MISSING_MANDATORY_INPUT_FIELD",240041), INVALID_TYPE_ERROR("INVALID_TYPE_ERROR",240041),
     * INVALID_SNAPSHOT_SCHEDULE("INVALID_SNAPSHOT_SCHEDULE",240042), STORAGE_IO_PORTS_CONFIGURATION("STORAGE_IO_PORTS_CONFIGURATION",240043),
     * STORAGE_IO_PORTS_NOT_ENOUGH("STORAGE_IO_PORTS_NOT_ENOUGH",240044), STORAGE_CHECK_IO_PORTS_CONFIGURED("STORAGE_CHECK_IO_PORTS_CONFIGURED",240045),
     * STORAGE_REBALANCING_IO_PORTS("STORAGE_REBALANCING_IO_PORTS",240046), STORAGE_ONBOARDING_IP_NOT_ENOUGH("STORAGE_ONBOARDING_IP_NOT_ENOUGH",240047),
     * SNAPSHOT_SCHEDULE_HAS_VOLUMES("SNAPSHOT_SCHEDULE_HAS_VOLUMES",240048), STORAGE_REBOOT_ERROR("STORAGE_REBOOT_ERROR",240049),
     * STORAGE_POWEROFF_ERROR("STORAGE_POWEROFF_ERROR",240050),
     */
    ENUM_INVALID_DATA("ENUM_INVALID_DATA", 200002), ENUM_COMMUNICATION_ERROR("ENUM_COMMUNICATION_ERROR", 200008);
    private Integer id;
    private String value;


    private EnumErrorCode(String value, Integer id) {
        this.value = value;
        this.id = id;
    }


    public String getValue() {
        return this.value;
    }


    public Integer getId() {
        return this.id;
    }


    public String toString() {
        return this.value;
    }
}
