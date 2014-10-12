package com.mrfechetto.nextpeer;

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;

@NativeClass
public class NPTournamentPlayer extends NSObject {

//   @property (nonatomic, readonly, strong) NSString* playerName;

 /// A unique and persistent identifier for the player in Nextpeer.
// @property (nonatomic, readonly, strong) NSString* playerId;

 /// The player's avatar image URL.
// @property (nonatomic, readonly, strong) NSString* playerImageUrl;

 /// The player's avatar image. This is a cached object, and may return nil.
// @property (nonatomic, readonly, assign) UIImage* playerImage;

 /// A flag specifying if the player is a bot (a recording of a previous game) or a real player.
// @property (nonatomic, readonly, assign) BOOL playerIsBot;

 /**
  Checks if the receiver represents the current user.

  @return YES if the receiving tournament player object represents the current user, NO otherwise.
  */
// -(BOOL)isCurrentUser;
   @Method(selector = "isCurrentUser:")
   public native boolean isCurrentUser ();
}
