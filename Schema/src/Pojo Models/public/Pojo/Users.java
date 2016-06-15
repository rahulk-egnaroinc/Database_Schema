package gensrc2;
// Generated 9 Jun, 2016 7:09:50 PM by Hibernate Tools 4.0.0.Final

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Users generated by hbm2java
 */
public class Users implements java.io.Serializable {

	private int id;
	private Countries countries;
	private Channels channels;
	private String email;
	private String name;
	private Boolean newsletter;
	private Date createdAt;
	private Date updatedAt;
	private Boolean admin;
	private String addressStreet;
	private String addressNumber;
	private String addressComplement;
	private String addressNeighbourhood;
	private String addressCity;
	private String addressState;
	private String addressZipCode;
	private String phoneNumber;
	private String locale;
	private String cpf;
	private String encryptedPassword;
	private String resetPasswordToken;
	private Date resetPasswordSentAt;
	private Date rememberCreatedAt;
	private Integer signInCount;
	private Date currentSignInAt;
	private Date lastSignInAt;
	private String currentSignInIp;
	private String lastSignInIp;
	private String twitter;
	private String facebookLink;
	private String otherLink;
	private String uploadedImage;
	private String moipLogin;
	private String stateInscription;
	private Date deactivatedAt;
	private String reactivateToken;
	private String addressCountry;
	private String authenticationToken;
	private Boolean zeroCredits;
	private String aboutHtml;
	private String coverImage;
	private String permalink;
	private Boolean subscribedToProjectPosts;
	private Serializable fullTextIndex;
	private Set<ProjectNotifications> projectNotificationses = new HashSet<ProjectNotifications>(0);
	private Set<ChannelPosts> channelPostses = new HashSet<ChannelPosts>(0);
	private Set<UserFollowNotifications> userFollowNotificationses = new HashSet<UserFollowNotifications>(0);
	private Set<CreditCards> creditCardses = new HashSet<CreditCards>(0);
	private Set<CategoryNotifications> categoryNotificationses = new HashSet<CategoryNotifications>(0);
	private Set<UserTransfers> userTransferses = new HashSet<UserTransfers>(0);
	private Set<Donations> donationses = new HashSet<Donations>(0);
	private Set<ProjectReports> projectReportses = new HashSet<ProjectReports>(0);
	private Set<UserNotifications> userNotificationses = new HashSet<UserNotifications>(0);
	private Set<ProjectPostNotifications> projectPostNotificationses = new HashSet<ProjectPostNotifications>(0);
	private Set<ChannelsSubscribers> channelsSubscriberses = new HashSet<ChannelsSubscribers>(0);
	private Set<ProjectReportNotifications> projectReportNotificationses = new HashSet<ProjectReportNotifications>(0);
	private Set<BankAccounts> bankAccountses = new HashSet<BankAccounts>(0);
	private Set<Contributions> contributionses = new HashSet<Contributions>(0);
	private Set<Authorizations> authorizationses = new HashSet<Authorizations>(0);
	private Set<ChannelPostNotifications> channelPostNotificationses = new HashSet<ChannelPostNotifications>(0);
	private Set<PaymentTransfers> paymentTransferses = new HashSet<PaymentTransfers>(0);
	private Set<DonationNotifications> donationNotificationses = new HashSet<DonationNotifications>(0);
	private Set<UserFollows> userFollowsesForUserId = new HashSet<UserFollows>(0);
	private Set<DirectMessageNotifications> directMessageNotificationses = new HashSet<DirectMessageNotifications>(0);
	private Set<Unsubscribes> unsubscribeses = new HashSet<Unsubscribes>(0);
	private Set<UserFriends> userFriendsesForFriendId = new HashSet<UserFriends>(0);
	private Set<UserFollows> userFollowsesForFollowId = new HashSet<UserFollows>(0);
	private Set<DirectMessages> directMessagesesForUserId = new HashSet<DirectMessages>(0);
	private Set<UserFriends> userFriendsesForUserId = new HashSet<UserFriends>(0);
	private Set<UserTransferNotifications> userTransferNotificationses = new HashSet<UserTransferNotifications>(0);
	private Set<BalanceTransactions> balanceTransactionses = new HashSet<BalanceTransactions>(0);
	private Set<CategoryFollowers> categoryFollowerses = new HashSet<CategoryFollowers>(0);
	private Set<UserLinks> userLinkses = new HashSet<UserLinks>(0);
	private Set<Projects> projectses = new HashSet<Projects>(0);
	private Set<ContributionNotifications> contributionNotificationses = new HashSet<ContributionNotifications>(0);
	private Set<Rdevents> rdeventses = new HashSet<Rdevents>(0);
	private Set<ProjectReminders> projectReminderses = new HashSet<ProjectReminders>(0);
	private Set<BalanceTransfers> balanceTransferses = new HashSet<BalanceTransfers>(0);
	private Set<DirectMessages> directMessagesesForToUserId = new HashSet<DirectMessages>(0);
	private Set<ProjectPosts> projectPostses = new HashSet<ProjectPosts>(0);
	private Set<RedactorAssets> redactorAssetses = new HashSet<RedactorAssets>(0);

	public Users() {
	}

	public Users(int id, String email, String locale, String encryptedPassword, String authenticationToken,
			Serializable fullTextIndex) {
		this.id = id;
		this.email = email;
		this.locale = locale;
		this.encryptedPassword = encryptedPassword;
		this.authenticationToken = authenticationToken;
		this.fullTextIndex = fullTextIndex;
	}

	public Users(int id, Countries countries, Channels channels, String email, String name, Boolean newsletter,
			Date createdAt, Date updatedAt, Boolean admin, String addressStreet, String addressNumber,
			String addressComplement, String addressNeighbourhood, String addressCity, String addressState,
			String addressZipCode, String phoneNumber, String locale, String cpf, String encryptedPassword,
			String resetPasswordToken, Date resetPasswordSentAt, Date rememberCreatedAt, Integer signInCount,
			Date currentSignInAt, Date lastSignInAt, String currentSignInIp, String lastSignInIp, String twitter,
			String facebookLink, String otherLink, String uploadedImage, String moipLogin, String stateInscription,
			Date deactivatedAt, String reactivateToken, String addressCountry, String authenticationToken,
			Boolean zeroCredits, String aboutHtml, String coverImage, String permalink,
			Boolean subscribedToProjectPosts, Serializable fullTextIndex,
			Set<ProjectNotifications> projectNotificationses, Set<ChannelPosts> channelPostses,
			Set<UserFollowNotifications> userFollowNotificationses, Set<CreditCards> creditCardses,
			Set<CategoryNotifications> categoryNotificationses, Set<UserTransfers> userTransferses,
			Set<Donations> donationses, Set<ProjectReports> projectReportses,
			Set<UserNotifications> userNotificationses, Set<ProjectPostNotifications> projectPostNotificationses,
			Set<ChannelsSubscribers> channelsSubscriberses,
			Set<ProjectReportNotifications> projectReportNotificationses, Set<BankAccounts> bankAccountses,
			Set<Contributions> contributionses, Set<Authorizations> authorizationses,
			Set<ChannelPostNotifications> channelPostNotificationses, Set<PaymentTransfers> paymentTransferses,
			Set<DonationNotifications> donationNotificationses, Set<UserFollows> userFollowsesForUserId,
			Set<DirectMessageNotifications> directMessageNotificationses, Set<Unsubscribes> unsubscribeses,
			Set<UserFriends> userFriendsesForFriendId, Set<UserFollows> userFollowsesForFollowId,
			Set<DirectMessages> directMessagesesForUserId, Set<UserFriends> userFriendsesForUserId,
			Set<UserTransferNotifications> userTransferNotificationses, Set<BalanceTransactions> balanceTransactionses,
			Set<CategoryFollowers> categoryFollowerses, Set<UserLinks> userLinkses, Set<Projects> projectses,
			Set<ContributionNotifications> contributionNotificationses, Set<Rdevents> rdeventses,
			Set<ProjectReminders> projectReminderses, Set<BalanceTransfers> balanceTransferses,
			Set<DirectMessages> directMessagesesForToUserId, Set<ProjectPosts> projectPostses,
			Set<RedactorAssets> redactorAssetses) {
		this.id = id;
		this.countries = countries;
		this.channels = channels;
		this.email = email;
		this.name = name;
		this.newsletter = newsletter;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.admin = admin;
		this.addressStreet = addressStreet;
		this.addressNumber = addressNumber;
		this.addressComplement = addressComplement;
		this.addressNeighbourhood = addressNeighbourhood;
		this.addressCity = addressCity;
		this.addressState = addressState;
		this.addressZipCode = addressZipCode;
		this.phoneNumber = phoneNumber;
		this.locale = locale;
		this.cpf = cpf;
		this.encryptedPassword = encryptedPassword;
		this.resetPasswordToken = resetPasswordToken;
		this.resetPasswordSentAt = resetPasswordSentAt;
		this.rememberCreatedAt = rememberCreatedAt;
		this.signInCount = signInCount;
		this.currentSignInAt = currentSignInAt;
		this.lastSignInAt = lastSignInAt;
		this.currentSignInIp = currentSignInIp;
		this.lastSignInIp = lastSignInIp;
		this.twitter = twitter;
		this.facebookLink = facebookLink;
		this.otherLink = otherLink;
		this.uploadedImage = uploadedImage;
		this.moipLogin = moipLogin;
		this.stateInscription = stateInscription;
		this.deactivatedAt = deactivatedAt;
		this.reactivateToken = reactivateToken;
		this.addressCountry = addressCountry;
		this.authenticationToken = authenticationToken;
		this.zeroCredits = zeroCredits;
		this.aboutHtml = aboutHtml;
		this.coverImage = coverImage;
		this.permalink = permalink;
		this.subscribedToProjectPosts = subscribedToProjectPosts;
		this.fullTextIndex = fullTextIndex;
		this.projectNotificationses = projectNotificationses;
		this.channelPostses = channelPostses;
		this.userFollowNotificationses = userFollowNotificationses;
		this.creditCardses = creditCardses;
		this.categoryNotificationses = categoryNotificationses;
		this.userTransferses = userTransferses;
		this.donationses = donationses;
		this.projectReportses = projectReportses;
		this.userNotificationses = userNotificationses;
		this.projectPostNotificationses = projectPostNotificationses;
		this.channelsSubscriberses = channelsSubscriberses;
		this.projectReportNotificationses = projectReportNotificationses;
		this.bankAccountses = bankAccountses;
		this.contributionses = contributionses;
		this.authorizationses = authorizationses;
		this.channelPostNotificationses = channelPostNotificationses;
		this.paymentTransferses = paymentTransferses;
		this.donationNotificationses = donationNotificationses;
		this.userFollowsesForUserId = userFollowsesForUserId;
		this.directMessageNotificationses = directMessageNotificationses;
		this.unsubscribeses = unsubscribeses;
		this.userFriendsesForFriendId = userFriendsesForFriendId;
		this.userFollowsesForFollowId = userFollowsesForFollowId;
		this.directMessagesesForUserId = directMessagesesForUserId;
		this.userFriendsesForUserId = userFriendsesForUserId;
		this.userTransferNotificationses = userTransferNotificationses;
		this.balanceTransactionses = balanceTransactionses;
		this.categoryFollowerses = categoryFollowerses;
		this.userLinkses = userLinkses;
		this.projectses = projectses;
		this.contributionNotificationses = contributionNotificationses;
		this.rdeventses = rdeventses;
		this.projectReminderses = projectReminderses;
		this.balanceTransferses = balanceTransferses;
		this.directMessagesesForToUserId = directMessagesesForToUserId;
		this.projectPostses = projectPostses;
		this.redactorAssetses = redactorAssetses;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Countries getCountries() {
		return this.countries;
	}

	public void setCountries(Countries countries) {
		this.countries = countries;
	}

	public Channels getChannels() {
		return this.channels;
	}

	public void setChannels(Channels channels) {
		this.channels = channels;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getNewsletter() {
		return this.newsletter;
	}

	public void setNewsletter(Boolean newsletter) {
		this.newsletter = newsletter;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Boolean getAdmin() {
		return this.admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

	public String getAddressStreet() {
		return this.addressStreet;
	}

	public void setAddressStreet(String addressStreet) {
		this.addressStreet = addressStreet;
	}

	public String getAddressNumber() {
		return this.addressNumber;
	}

	public void setAddressNumber(String addressNumber) {
		this.addressNumber = addressNumber;
	}

	public String getAddressComplement() {
		return this.addressComplement;
	}

	public void setAddressComplement(String addressComplement) {
		this.addressComplement = addressComplement;
	}

	public String getAddressNeighbourhood() {
		return this.addressNeighbourhood;
	}

	public void setAddressNeighbourhood(String addressNeighbourhood) {
		this.addressNeighbourhood = addressNeighbourhood;
	}

	public String getAddressCity() {
		return this.addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public String getAddressState() {
		return this.addressState;
	}

	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}

	public String getAddressZipCode() {
		return this.addressZipCode;
	}

	public void setAddressZipCode(String addressZipCode) {
		this.addressZipCode = addressZipCode;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getLocale() {
		return this.locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEncryptedPassword() {
		return this.encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}

	public String getResetPasswordToken() {
		return this.resetPasswordToken;
	}

	public void setResetPasswordToken(String resetPasswordToken) {
		this.resetPasswordToken = resetPasswordToken;
	}

	public Date getResetPasswordSentAt() {
		return this.resetPasswordSentAt;
	}

	public void setResetPasswordSentAt(Date resetPasswordSentAt) {
		this.resetPasswordSentAt = resetPasswordSentAt;
	}

	public Date getRememberCreatedAt() {
		return this.rememberCreatedAt;
	}

	public void setRememberCreatedAt(Date rememberCreatedAt) {
		this.rememberCreatedAt = rememberCreatedAt;
	}

	public Integer getSignInCount() {
		return this.signInCount;
	}

	public void setSignInCount(Integer signInCount) {
		this.signInCount = signInCount;
	}

	public Date getCurrentSignInAt() {
		return this.currentSignInAt;
	}

	public void setCurrentSignInAt(Date currentSignInAt) {
		this.currentSignInAt = currentSignInAt;
	}

	public Date getLastSignInAt() {
		return this.lastSignInAt;
	}

	public void setLastSignInAt(Date lastSignInAt) {
		this.lastSignInAt = lastSignInAt;
	}

	public String getCurrentSignInIp() {
		return this.currentSignInIp;
	}

	public void setCurrentSignInIp(String currentSignInIp) {
		this.currentSignInIp = currentSignInIp;
	}

	public String getLastSignInIp() {
		return this.lastSignInIp;
	}

	public void setLastSignInIp(String lastSignInIp) {
		this.lastSignInIp = lastSignInIp;
	}

	public String getTwitter() {
		return this.twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getFacebookLink() {
		return this.facebookLink;
	}

	public void setFacebookLink(String facebookLink) {
		this.facebookLink = facebookLink;
	}

	public String getOtherLink() {
		return this.otherLink;
	}

	public void setOtherLink(String otherLink) {
		this.otherLink = otherLink;
	}

	public String getUploadedImage() {
		return this.uploadedImage;
	}

	public void setUploadedImage(String uploadedImage) {
		this.uploadedImage = uploadedImage;
	}

	public String getMoipLogin() {
		return this.moipLogin;
	}

	public void setMoipLogin(String moipLogin) {
		this.moipLogin = moipLogin;
	}

	public String getStateInscription() {
		return this.stateInscription;
	}

	public void setStateInscription(String stateInscription) {
		this.stateInscription = stateInscription;
	}

	public Date getDeactivatedAt() {
		return this.deactivatedAt;
	}

	public void setDeactivatedAt(Date deactivatedAt) {
		this.deactivatedAt = deactivatedAt;
	}

	public String getReactivateToken() {
		return this.reactivateToken;
	}

	public void setReactivateToken(String reactivateToken) {
		this.reactivateToken = reactivateToken;
	}

	public String getAddressCountry() {
		return this.addressCountry;
	}

	public void setAddressCountry(String addressCountry) {
		this.addressCountry = addressCountry;
	}

	public String getAuthenticationToken() {
		return this.authenticationToken;
	}

	public void setAuthenticationToken(String authenticationToken) {
		this.authenticationToken = authenticationToken;
	}

	public Boolean getZeroCredits() {
		return this.zeroCredits;
	}

	public void setZeroCredits(Boolean zeroCredits) {
		this.zeroCredits = zeroCredits;
	}

	public String getAboutHtml() {
		return this.aboutHtml;
	}

	public void setAboutHtml(String aboutHtml) {
		this.aboutHtml = aboutHtml;
	}

	public String getCoverImage() {
		return this.coverImage;
	}

	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
	}

	public String getPermalink() {
		return this.permalink;
	}

	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}

	public Boolean getSubscribedToProjectPosts() {
		return this.subscribedToProjectPosts;
	}

	public void setSubscribedToProjectPosts(Boolean subscribedToProjectPosts) {
		this.subscribedToProjectPosts = subscribedToProjectPosts;
	}

	public Serializable getFullTextIndex() {
		return this.fullTextIndex;
	}

	public void setFullTextIndex(Serializable fullTextIndex) {
		this.fullTextIndex = fullTextIndex;
	}

	public Set<ProjectNotifications> getProjectNotificationses() {
		return this.projectNotificationses;
	}

	public void setProjectNotificationses(Set<ProjectNotifications> projectNotificationses) {
		this.projectNotificationses = projectNotificationses;
	}

	public Set<ChannelPosts> getChannelPostses() {
		return this.channelPostses;
	}

	public void setChannelPostses(Set<ChannelPosts> channelPostses) {
		this.channelPostses = channelPostses;
	}

	public Set<UserFollowNotifications> getUserFollowNotificationses() {
		return this.userFollowNotificationses;
	}

	public void setUserFollowNotificationses(Set<UserFollowNotifications> userFollowNotificationses) {
		this.userFollowNotificationses = userFollowNotificationses;
	}

	public Set<CreditCards> getCreditCardses() {
		return this.creditCardses;
	}

	public void setCreditCardses(Set<CreditCards> creditCardses) {
		this.creditCardses = creditCardses;
	}

	public Set<CategoryNotifications> getCategoryNotificationses() {
		return this.categoryNotificationses;
	}

	public void setCategoryNotificationses(Set<CategoryNotifications> categoryNotificationses) {
		this.categoryNotificationses = categoryNotificationses;
	}

	public Set<UserTransfers> getUserTransferses() {
		return this.userTransferses;
	}

	public void setUserTransferses(Set<UserTransfers> userTransferses) {
		this.userTransferses = userTransferses;
	}

	public Set<Donations> getDonationses() {
		return this.donationses;
	}

	public void setDonationses(Set<Donations> donationses) {
		this.donationses = donationses;
	}

	public Set<ProjectReports> getProjectReportses() {
		return this.projectReportses;
	}

	public void setProjectReportses(Set<ProjectReports> projectReportses) {
		this.projectReportses = projectReportses;
	}

	public Set<UserNotifications> getUserNotificationses() {
		return this.userNotificationses;
	}

	public void setUserNotificationses(Set<UserNotifications> userNotificationses) {
		this.userNotificationses = userNotificationses;
	}

	public Set<ProjectPostNotifications> getProjectPostNotificationses() {
		return this.projectPostNotificationses;
	}

	public void setProjectPostNotificationses(Set<ProjectPostNotifications> projectPostNotificationses) {
		this.projectPostNotificationses = projectPostNotificationses;
	}

	public Set<ChannelsSubscribers> getChannelsSubscriberses() {
		return this.channelsSubscriberses;
	}

	public void setChannelsSubscriberses(Set<ChannelsSubscribers> channelsSubscriberses) {
		this.channelsSubscriberses = channelsSubscriberses;
	}

	public Set<ProjectReportNotifications> getProjectReportNotificationses() {
		return this.projectReportNotificationses;
	}

	public void setProjectReportNotificationses(Set<ProjectReportNotifications> projectReportNotificationses) {
		this.projectReportNotificationses = projectReportNotificationses;
	}

	public Set<BankAccounts> getBankAccountses() {
		return this.bankAccountses;
	}

	public void setBankAccountses(Set<BankAccounts> bankAccountses) {
		this.bankAccountses = bankAccountses;
	}

	public Set<Contributions> getContributionses() {
		return this.contributionses;
	}

	public void setContributionses(Set<Contributions> contributionses) {
		this.contributionses = contributionses;
	}

	public Set<Authorizations> getAuthorizationses() {
		return this.authorizationses;
	}

	public void setAuthorizationses(Set<Authorizations> authorizationses) {
		this.authorizationses = authorizationses;
	}

	public Set<ChannelPostNotifications> getChannelPostNotificationses() {
		return this.channelPostNotificationses;
	}

	public void setChannelPostNotificationses(Set<ChannelPostNotifications> channelPostNotificationses) {
		this.channelPostNotificationses = channelPostNotificationses;
	}

	public Set<PaymentTransfers> getPaymentTransferses() {
		return this.paymentTransferses;
	}

	public void setPaymentTransferses(Set<PaymentTransfers> paymentTransferses) {
		this.paymentTransferses = paymentTransferses;
	}

	public Set<DonationNotifications> getDonationNotificationses() {
		return this.donationNotificationses;
	}

	public void setDonationNotificationses(Set<DonationNotifications> donationNotificationses) {
		this.donationNotificationses = donationNotificationses;
	}

	public Set<UserFollows> getUserFollowsesForUserId() {
		return this.userFollowsesForUserId;
	}

	public void setUserFollowsesForUserId(Set<UserFollows> userFollowsesForUserId) {
		this.userFollowsesForUserId = userFollowsesForUserId;
	}

	public Set<DirectMessageNotifications> getDirectMessageNotificationses() {
		return this.directMessageNotificationses;
	}

	public void setDirectMessageNotificationses(Set<DirectMessageNotifications> directMessageNotificationses) {
		this.directMessageNotificationses = directMessageNotificationses;
	}

	public Set<Unsubscribes> getUnsubscribeses() {
		return this.unsubscribeses;
	}

	public void setUnsubscribeses(Set<Unsubscribes> unsubscribeses) {
		this.unsubscribeses = unsubscribeses;
	}

	public Set<UserFriends> getUserFriendsesForFriendId() {
		return this.userFriendsesForFriendId;
	}

	public void setUserFriendsesForFriendId(Set<UserFriends> userFriendsesForFriendId) {
		this.userFriendsesForFriendId = userFriendsesForFriendId;
	}

	public Set<UserFollows> getUserFollowsesForFollowId() {
		return this.userFollowsesForFollowId;
	}

	public void setUserFollowsesForFollowId(Set<UserFollows> userFollowsesForFollowId) {
		this.userFollowsesForFollowId = userFollowsesForFollowId;
	}

	public Set<DirectMessages> getDirectMessagesesForUserId() {
		return this.directMessagesesForUserId;
	}

	public void setDirectMessagesesForUserId(Set<DirectMessages> directMessagesesForUserId) {
		this.directMessagesesForUserId = directMessagesesForUserId;
	}

	public Set<UserFriends> getUserFriendsesForUserId() {
		return this.userFriendsesForUserId;
	}

	public void setUserFriendsesForUserId(Set<UserFriends> userFriendsesForUserId) {
		this.userFriendsesForUserId = userFriendsesForUserId;
	}

	public Set<UserTransferNotifications> getUserTransferNotificationses() {
		return this.userTransferNotificationses;
	}

	public void setUserTransferNotificationses(Set<UserTransferNotifications> userTransferNotificationses) {
		this.userTransferNotificationses = userTransferNotificationses;
	}

	public Set<BalanceTransactions> getBalanceTransactionses() {
		return this.balanceTransactionses;
	}

	public void setBalanceTransactionses(Set<BalanceTransactions> balanceTransactionses) {
		this.balanceTransactionses = balanceTransactionses;
	}

	public Set<CategoryFollowers> getCategoryFollowerses() {
		return this.categoryFollowerses;
	}

	public void setCategoryFollowerses(Set<CategoryFollowers> categoryFollowerses) {
		this.categoryFollowerses = categoryFollowerses;
	}

	public Set<UserLinks> getUserLinkses() {
		return this.userLinkses;
	}

	public void setUserLinkses(Set<UserLinks> userLinkses) {
		this.userLinkses = userLinkses;
	}

	public Set<Projects> getProjectses() {
		return this.projectses;
	}

	public void setProjectses(Set<Projects> projectses) {
		this.projectses = projectses;
	}

	public Set<ContributionNotifications> getContributionNotificationses() {
		return this.contributionNotificationses;
	}

	public void setContributionNotificationses(Set<ContributionNotifications> contributionNotificationses) {
		this.contributionNotificationses = contributionNotificationses;
	}

	public Set<Rdevents> getRdeventses() {
		return this.rdeventses;
	}

	public void setRdeventses(Set<Rdevents> rdeventses) {
		this.rdeventses = rdeventses;
	}

	public Set<ProjectReminders> getProjectReminderses() {
		return this.projectReminderses;
	}

	public void setProjectReminderses(Set<ProjectReminders> projectReminderses) {
		this.projectReminderses = projectReminderses;
	}

	public Set<BalanceTransfers> getBalanceTransferses() {
		return this.balanceTransferses;
	}

	public void setBalanceTransferses(Set<BalanceTransfers> balanceTransferses) {
		this.balanceTransferses = balanceTransferses;
	}

	public Set<DirectMessages> getDirectMessagesesForToUserId() {
		return this.directMessagesesForToUserId;
	}

	public void setDirectMessagesesForToUserId(Set<DirectMessages> directMessagesesForToUserId) {
		this.directMessagesesForToUserId = directMessagesesForToUserId;
	}

	public Set<ProjectPosts> getProjectPostses() {
		return this.projectPostses;
	}

	public void setProjectPostses(Set<ProjectPosts> projectPostses) {
		this.projectPostses = projectPostses;
	}

	public Set<RedactorAssets> getRedactorAssetses() {
		return this.redactorAssetses;
	}

	public void setRedactorAssetses(Set<RedactorAssets> redactorAssetses) {
		this.redactorAssetses = redactorAssetses;
	}

}
