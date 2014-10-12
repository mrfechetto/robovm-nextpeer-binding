package com.mrfechetto.nextpeer;

import org.robovm.apple.foundation.NSData;
import org.robovm.apple.foundation.NSObject;
import org.robovm.apple.uikit.UIImage;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;

@NativeClass
public class NPTournamentCustomMessageBaseContainer extends NSObject {
// /// The player name.
//   @property (nonatomic, readonly) NSString* playerName;
   @Property(selector = "playerName")
   public native String getPlayerName ();

   @Property(selector = "setPlayerName:")
   public native void setPlayerName (String tournamentUuid);

//   /// A unique player identifier for the current game.
//   @property (nonatomic, readonly) NSString* playerId;
   @Property(selector = "playerId")
   public native String getPlayerId ();

   @Property(selector = "setPlayerId:")
   public native void setPlayerId (String tournamentUuid);

//   /// The player's profile image URL.
//   @property (nonatomic, readonly) NSString* playerImageUrl;
   @Property(selector = "playerImageUrl")
   public native String getPlayerImageUrl ();

   @Property(selector = "setPlayerImageUrl:")
   public native void setPlayerImageUrl (String tournamentUuid);

//   /// The player image
//   /// @note This property can sometimes return nil, this happens if the image for the player that sent the message is unavailable.
//   @property (nonatomic, readonly) UIImage* playerImage;
   @Property(selector = "playerImage")
   public native UIImage getPlayerImage ();

   @Property(selector = "setPlayerImage:")
   public native void setPlayerImage (UIImage playerImage);

//   /// Boolean value that indicates if this message came form a bot recording or a real-life player.
//   @property (nonatomic, readonly) BOOL playerIsBot;
   @Property(selector = "playerIsBot")
   public native boolean getPlayerIsBot ();

   @Property(selector = "setPlayerIsBot:")
   public native void setPlayerIsBot (boolean playerIsBot);

//   /// The custom message (passed as a buffer).
//   @property (nonatomic, readonly) NSData* message;
   @Property(selector = "message")
   public native NSData getMessage ();

   @Property(selector = "setMessage:")
   public native void setMessage (NSData message);
}
