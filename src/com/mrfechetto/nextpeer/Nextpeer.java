package com.mrfechetto.nextpeer;

import org.robovm.apple.foundation.NSData;
import org.robovm.apple.foundation.NSDictionary;
import org.robovm.apple.foundation.NSObject;
import org.robovm.apple.foundation.NSURL;
import org.robovm.apple.uikit.UIInterfaceOrientation;
import org.robovm.apple.uikit.UILocalNotification;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;

@NativeClass
public class Nextpeer extends NSObject {

   /**
   @param productKey This is your unique product key you received when registering your application. Is copied.
   @param delegatesContainer The delegates container is retained but none of the delegates in the container are retained.
   */
//  + (void)initializeWithProductKey:(NSString*)productKey
//                      andDelegates:(NPDelegatesContainer*)delegatesContainer;
   @Method(selector = "initializeWithProductKey:andDelegates:")
   public static native void initializeWithProductKey (String productKey, NPDelegatesContainer delegatesContainer);
   
   /**
   @param productKey This is your unique product key you received when registering your application. Is copied.
   @param settings The available settings are defined as NextpeerSettingXXXXXXXXXXXX. See NextpeerSettings.h.
   @param delegatesContainer The delegates container is retained but none of the delegates in the container are retained.
   */
//  + (void)initializeWithProductKey:(NSString*)productKey
//                       andSettings:(NSDictionary*)settings
//                      andDelegates:(NPDelegatesContainer*)delegatesContainer;
   @Method(selector = "initializeWithProductKey:andSettings:andDelegates:")
   public static native void initializeWithProductKey (String productKey, NSDictionary settings, NPDelegatesContainer delegatesContainer);
   
   /**
   Launches the Nextpeer Dashboard view at the top of your application's keyed window.
   
   @note If [Nextpeer isNextpeerSupported] returns NO this method will not execute.
   If the player has not yet authorized your app, they will be prompted to setup an
   account or authorize your application before accessing the Nextpeer dashboard.
   */
//  + (void)launchDashboard;
   @Method(selector = "launchDashboard")
   public static native void launchDashboard ();
   
   /**
   @return The release Version String of the Nextpeer client library in use.
   */
//  + (NSString*)releaseVersionString;
   @Method(selector = "releaseVersionString")
   public static native String releaseVersionString ();

  /**
   Removes the Nextpeer dashboard from your application's keyed window.
   */
//  + (void)dismissDashboard;
   @Method(selector = "dismissDashboard")
   public static native void dismissDashboard ();

  /**
   Call this method when you wish to change the notification orientation in run time.
   It's preferable to use the settings dictionary if you wish to set this up at start-time.
   
   @deprecated This method no longer has any effect. Please use the NextpeerSettingNotificationOrientation and NextpeerSettingObserveNotificationOrientationChange keys in NextpeerSettings.h.
   */
//  + (void)setNotificationOrientation:(UIInterfaceOrientation)orientation DEPRECATED_ATTRIBUTE;
   @Method(selector = "setNotificationOrientation:")
   public static native void setNotificationOrientation (UIInterfaceOrientation orientation);

  /**
   Let the platform handle a url request, this will used when the Facebook App redirects to the app during the SSO process.
   @note The SDK may launch the Nextpeer dashboard under some scenarios from this call.
   @param url The URL that was passed to the application delegate's handleOpenURL method(s).
   @return YES if the url starts with np[app_id] and the SDK handled the request; NO if the attempt to handle the URL failed (not supported by the platform).
   */
//  + (BOOL)handleOpenURL:(NSURL *)url;
   @Method(selector = "handleOpenURL:")
   public static native boolean handleOpenURL (NSURL url);

  /**
   Call this method to verify if the current run time environment supports Nextpeer requirements.
   
   @note Minimum iOS version supported by the SDK is iOS 4.0. You can handle such case by implementing the 
         [NextpeerDelegate nextpeerNotSupportedShouldShowCustomError] method (otherwise Nextpeer will display alert).
   
   @return YES if the run time requirements match, NO otherwise.
   */
//  + (BOOL)isNextpeerSupported;
   @Method(selector = "isNextpeerSupported")
   public static native boolean isNextpeerSupported ();

  /**
   Call this method register this user's device token. This will allow Nextpeer to send invitations to this user
   when he/she is invited to play the current game. Note that this is only relevant if you've followed the push notification
   integration instructions and provided the p12 file for your game.
   
   @param deviceToken The device token, as reported by the iOS SDK.
   
   Example:
   
       - (void)application:(UIApplication *)application didRegisterForRemoteNotificationsWithDeviceToken:(NSData *)deviceToken {
           // Updates the device token and registers the token with Nextpeer
           [Nextpeer registerDeviceToken:deviceToken];
       }
   
   */
//  + (void)registerDeviceToken:(NSData*)deviceToken;
   @Method(selector = "registerDeviceToken:")
   public static native void registerDeviceToken (NSData deviceToken);

  /**
   Call this method after the launching of the app. This allows Nextpeer to respond to any push or local notifications
   that may have been received when the app was in the background.
   Note that you will need to call this method after Nextpeer has already been initialized.
   
   @param launchOptions The launch options of the application, as reported by the iOS SDK.
   
   Example:
   
       - (BOOL)application:(UIApplication *)application didFinishLaunchingWithOptions:(NSDictionary *)launchOptions {
           ...
           [Nextpeer initializeWithProductKey:...];
           ...
           [Nextpeer handleLaunchOptions:launchOptions];
           ...
       }
   
   @return Returns a boolean value indicating if the notification will be handled by Nextpeer.
   */
//  + (BOOL)handleLaunchOptions:(NSDictionary*)launchOptions;
   @Method(selector = "handleLaunchOptions:")
   public static native boolean handleLaunchOptions (NSDictionary launchOptions);

  /**
   Call this method after the receiving a remote push notification while the app is running.
   
   @param userInfo The user info for the notification, as reported by the iOS SDK.
   
   Example:
   
       - (void)application:(UIApplication *)application didReceiveRemoteNotification:(NSDictionary *)userInfo {
          ...
          [Nextpeer handleRemoteNotification:userInfo];
          ...
       }
   
   @return Returns a boolean value indicating if the notification will be handled by Nextpeer.
   */
//  + (BOOL)handleRemoteNotification:(NSDictionary*)userInfo;
   @Method(selector = "handleRemoteNotification:")
   public static native boolean handleRemoteNotification (NSDictionary userInfo);

  /**
   Call this method after the receiving a local push notification while the app is running.
   
   @param notification The notification, as reported by the iOS SDK.
   
   Example:
   
       - (void)application:(UIApplication *)application didReceiveLocalNotification:(UILocalNotification *)notification {
           ...
           [Nextpeer handleLocalNotification:notification];
           ...
       }
   
   @return Returns a boolean value indicating if the notification will be handled by Nextpeer.
   */
//  + (BOOL)handleLocalNotification:(UILocalNotification*)notification;
   @Method(selector = "handleLocalNotification:")
   public static native boolean handleLocalNotification (UILocalNotification notification);


   
   
   
   /**
    * Tournament methods
    * 
    */
   
   /**
   This method is used to push a buffer to the other players.
   This can potentially be used to create custom notifications or some other interactive mechanism
   that incorporates the other players. The buffer will be sent to the other players and will activate the 
   [NPTournamentDelegate nextpeerDidReceiveTournamentCustomMessage:] method on their delegate.
   
   @param data The data to broadcast to the other players.
   */
//  + (void)pushDataToOtherPlayers:(NSData*)data;
  @Method(selector = "pushDataToOtherPlayers:")
  public static native void pushDataToOtherPlayers (NSData data);

  /**
   This method is used to push a buffer to the other players in an unreliable fashion.
   This is usually used to update other game clients about the current game state for this specific player. 
   The buffer will be sent to the other players and will activate the
   [NPTournamentDelegate nextpeerDidReceiveUnreliableTournamentCustomMessage:] method on their delegate.
   The data is not guranteed to reach all or even any of the players. Use this method when you need a low latency data transfer.

   @warning Unerliable data is limited to just 1300 bytes, any buffers over that size will be discarded with a warning to the console.
   
   @param data The data to broadcast to the other players.
   */
//  + (void)unreliablePushDataToOtherPlayers:(NSData*)data;
  @Method(selector = "unreliablePushDataToOtherPlayers:")
  public static native void unreliablePushDataToOtherPlayers (NSData data);

  /**
   Registers to a synchronized event.
   
   A synchronized event can be used to synchronize all players at a particular point in the game. For example, at the beginning of the game, each client may need to load resources, which takes variable time, depending on the player's device. The event will be fired (see [NPTournamentDelegate nextpeerDidReceiveSynchronizedEvent:withReason:]) either when everyone registered for it, or after the specified timeout, and all players will receive it at the same time.
   
   When working with synchronized events, you should be aware of the following edge cases:
   
   1. Clients who are too late to register to an event will not be notified of the event until they register.
   2. Recordings will pause when they register to an event that wasn't registered to by a real player, and will wait until the event is fired due the registration of a live player(s).
   3. Recordings that are late to register to an event will behave just as regular clients, and will continue their playback as usual.
   
   @param eventName The name of the synchronized event to register to.
   @param timeout The maximum amount of time to wait for all other participants to register for the sync event.
   */
//  + (void)registerToSynchronizedEvent:(NSString*)eventName withTimetout:(NSTimeInterval)timeout;
  @Method(selector = "registerToSynchronizedEvent:withTimetout:")
  public static native void registerToSynchronizedEvent (String eventName, double timeout);

  /**
   Call this method to report the current score for the tournament. This allows Nextpeer to send
   various notifications about the players' scores.
   
   @param score The player's current score.
   */
//  + (void)reportScoreForCurrentTournament:(uint32_t)score;
  @Method(selector = "reportScoreForCurrentTournament:")
  public static native void reportScoreForCurrentTournament (int score);

  /**
   Call this method to change the score modifier of the giving recording. The modifier can be negative or positive and thus points will either
   be added or reduced from the recording's score.
   
   @param modifier The score modifire to apply to the recording.
   @param recordingPlayerId The player ID of the target recording (see [NPTournamentPlayer playerId]).
   */
//  + (void)reportScoreModifier:(int32_t)modifier forRecording:(NSString*)recordingPlayerId;
  @Method(selector = "reportScoreModifier:forRecording:")
  public static native void reportScoreModifier (int modifier, String recordingPlayerId);

  /**
   Call this method to pause the given recording.
   
   @param recordingPlayerId The player ID of the target recording (see [NPTournamentPlayer playerId]).
   */
//  + (void)requestPauseRecording:(NSString*)recordingPlayerId;
  @Method(selector = "requestPauseRecording:")
  public static native void requestPauseRecording (String recordingPlayerId);

  /**
   Call this method to resume the given recording.
   
   @param recordingPlayerId The player ID of the target recording (see [NPTournamentPlayer playerId]).
   */
//  + (void)requestResumeRecording:(NSString*)recordingPlayerId;
  @Method(selector = "requestResumeRecording:")
  public static native void requestResumeRecording (String recordingPlayerId);

  /**
   Call this method to stop the given recording.
   
   @param recordingPlayerId The player ID of the target recording (see [NPTournamentPlayer playerId]).
   */
//  + (void)requestStopRecording:(NSString*)recordingPlayerId;
  @Method(selector = "requestStopRecording:")
  public static native void requestStopRecording (String recordingPlayerId);

  /**
   Call this method to rewind the given recording by timeDelta milliseconds.
   
   @param recordingPlayerId The player ID of the target recording (see [NPTournamentPlayer playerId]).
   @param timeDelta The interval (in milliseconds) by to rewind the recording.
   */
//  + (void)requestRewindRecording:(NSString*)recordingPlayerId withTimeDelta:(uint32_t)timeDelta;
  @Method(selector = "requestRewindRecording:withTimeDelta:")
  public static native void requestRewindRecording (String recordingPlayerId, int timeDelta);

  /**
   Call this method to fast forwad the given recording by timeDelta milliseconds.
   
   @param recordingPlayerId The player ID of the target recording (see [NPTournamentPlayer playerId]).
   @param timeDelta The interval (in milliseconds) by which to fast-forward the recording.
   */
//  + (void)requestFastForwardRecording:(NSString*)recordingPlayerId withTimeDelta:(uint32_t)timeDelta;
  @Method(selector = "requestFastForwardRecording:withTimeDelta:")
  public static native void requestFastForwardRecording (String recordingPlayerId, int timeDelta);


  /**
   Call this method to check if any tournament is running at the moment.
   */
//  + (BOOL)isCurrentlyInTournament;
  @Method(selector = "isCurrentlyInTournament:")
  public static native boolean isCurrentlyInTournament ();

  /**
   Call this method when the user wishes to exit the current tournament.
   This will close any in-game notifiactions and dialogs.
   */
//  + (void)reportForfeitForCurrentTournament;
  @Method(selector = "reportForfeitForCurrentTournament")
  public static native void reportForfeitForCurrentTournament ();

  /**
   Call this method when your game manages the current tournament and the player just died (a.k.a. 'Last Man Standing').
   Nextpeer will call the [NextpeerDelegate nextpeerDidTournamentEnd] method after reporting the last score.
   
   @note The method will act only if the current tournament is from a 'GameControlled' tournament type.
   
   @param score The final score of the player.
   */
//  + (void)reportControlledTournamentOverWithScore:(uint32_t)score;
  @Method(selector = "reportControlledTournamentOverWithScore:")
  public static native void reportControlledTournamentOverWithScore (int score);

  /**
   This method will return the amount of seconds left for this tournament.
   
   @return The number of seconds left in the tournament, or 0 if there is no ongoing tournament or if the tournament is not time-based.
   */
//  + (NSUInteger)timeLeftInTournament;
  @Method(selector = "timeLeftInTournament")
  public static native int timeLeftInTournament ();

  /**
   Call this method to enable or disable the in-game ranking display during a tournament. You can change this setting during a tournament (making the ranking display appear and disappear), but will not be animated.
   
   @param enableRankingDisplay YES if the ranking display should be enabled, NO otherwise.
   */
//  +(void)enableRankingDisplay:(BOOL)enableRankingDisplay;
  @Method(selector = "enableRankingDisplay:")
  public static native void enableRankingDisplay (boolean enableRankingDisplay);

  /**
   Call this method when you have finished running the inter-game logic. The player will be taken to their next tournament.
   
   @see [NextpeerDelegate shouldAllowInterGameScreen]
   */
//  + (void)resumePlayAgainLogic;
  @Method(selector = "resumePlayAgainLogic")
  public static native void resumePlayAgainLogic ();

  /**
   This method will broadcast a notification to the other players in the tournament.
   The current player's image will be displayed along with the text.
   
   To use the current player's name in the message use %PLAYER_NAME%.
   E.g., @"%PLAYER_NAME% sent you a bomb!"
   
   @deprecated In-game notifications are no longer used, so this method is deprecated and will have no effect. Consider using [Nextpeer pushDataToOtherPlayers:] instead.
   */
//  + (void)pushMessageToOtherPlayers:(NSString*)message DEPRECATED_ATTRIBUTE;
  @Method(selector = "pushMessageToOtherPlayers:")
  public static native void pushMessageToOtherPlayers (String message);

}
