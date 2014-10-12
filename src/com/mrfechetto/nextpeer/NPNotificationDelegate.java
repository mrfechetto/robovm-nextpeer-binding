package com.mrfechetto.nextpeer;

import org.robovm.apple.foundation.NSObjectProtocol;
import org.robovm.objc.annotation.Method;

public interface NPNotificationDelegate extends NSObjectProtocol {

   /**
   Return whether or not Nextpeer should display a notification with the provided data.
   If false is returned, [NPNotificationDelegate nextpeerHandleDisallowedNotification:] gets called.
   If true is returned, [NPNotificationDelegate nextpeerNotificationWillShow:] gets called before the notification appears.
   
   deprecated In-game notifications are no longer used and are thus deprecated. This method will never be called. The replacement is the in-game ranking display, see [Nextpeer enableRankingDisplay:] in Nextpeer+Tournament.h if you wish to disable it.
   */
//  - (BOOL)nextpeerIsNotificationAllowed:(NPNotificationContainer *)notice DEPRECATED_ATTRIBUTE; 
   @Method(selector = "nextpeerIsNotificationAllowed:")
   public void nextpeerIsNotificationAllowed (NPNotificationContainer notice);

   /**
   Gets called when [NPNotificationDelegate nextpeerIsNotificationAllowed:] returns false. It is recommended to here display some sort of game
   specific version of the notification based on the notification data.
   
   deprecated In-game notifications are no longer used and are thus deprecated. This method will never be called.
   */
//  - (void)nextpeerHandleDisallowedNotification:(NPNotificationContainer *)notice DEPRECATED_ATTRIBUTE;
   @Method(selector = "nextpeerHandleDisallowedNotification:")
   public void nextpeerHandleDisallowedNotification (NPNotificationContainer notice);
   
   /**
   Gets called every time a notification is about to appear.
   
   deprecated In-game notifications are no longer used and are thus deprecated. This method will never be called.
   */
//  - (void)nextpeerNotificationWillShow:(NPNotificationContainer *)notice DEPRECATED_ATTRIBUTE;
   @Method(selector = "nextpeerNotificationWillShow:")
   public void nextpeerNotificationWillShow (NPNotificationContainer notice);
   
   /**
   This method is invoked when a tournament status is reported. A tournament status includes information
   regarding all the players in the tournament - their ranks, who is still playing, their names, IDs, avatar images, etc.
   This information can be used to, for example, generate custom ranking notifications.
   
   The rate of tournament status updates is approximately one per second.
   
   @param tournamentStatus The current tournament status.
   */
//  -(void)nextpeerDidReceiveTournamentStatus:(NPTournamentStatusInfo*)tournamentStatus;
   @Method(selector = "nextpeerDidReceiveTournamentStatus:")
   public void nextpeerDidReceiveTournamentStatus (NPTournamentStatusInfo tournamentStatus);
}
