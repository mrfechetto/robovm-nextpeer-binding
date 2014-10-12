package com.mrfechetto.nextpeer;

import org.robovm.apple.foundation.NSArray;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;

@NativeClass
public class NPTournamentStartDataContainer extends NSObject {
 /// The tournament UUID is provided so that your game can identify which tournament needs to be loaded.
 /// You can find the UUID in the developer dashboard
// @property (nonatomic, readonly) NSString* tournamentUuid;
   @Property(selector = "tournamentUuid")
   public native String getTournamentUuid ();

   @Property(selector = "setTournamentUuid:")
   public native void setTournamentUuid (String tournamentUuid);

 /// The tournament display name
// @property (nonatomic, readonly) NSString* tournamentName;
   @Property(selector = "tournamentName")
   public native String getTournamentName ();

   @Property(selector = "setTournamentName:")
   public native void setTournamentName (String tournamentName);

 /// The tournament time to play in seconds
// @property (nonatomic, readonly) uint32_t tournamentTimeSeconds;
   @Property(selector = "tournamentTimeSeconds")
   public native int getTournamentTimeSeconds ();

   @Property(selector = "setTournamentTimeSeconds:")
   public native void setTournamentTimeSeconds (int tournamentTimeSeconds);

 /// A random seed generated for this tournament. All players within the same tournament
 /// receive the same seed from the tournament. Can be used for level generation, to ensure
 /// all players play the same level in a specific game.
// @property (nonatomic, readonly) uint32_t tournamentRandomSeed;
   @Property(selector = "tournamentRandomSeed")
   public native int getTournamentRandomSeed ();

   @Property(selector = "setTournamentRandomSeed:")
   public native void setTournamentRandomSeed (int tournamentRandomSeed);

 /// A flag that states if the current tournament is game controlled
// @property (nonatomic, readonly) BOOL tournamentIsGameControlled;
   @Property(selector = "tournamentIsGameControlled")
   public native boolean getTournamentIsGameControlled ();

   @Property(selector = "setTournamentIsGameControlled:")
   public native void setTournamentIsGameControlled (boolean tournamentIsGameControlled);

 /// The number of players that started this tournament. Includes the current player.
// @property (nonatomic, readonly) uint32_t numberOfPlayers;
   @Property(selector = "numberOfPlayers")
   public native int getNumberOfPlayers ();

   @Property(selector = "setNumberOfPlayers:")
   public native void setNumberOfPlayers (int numberOfPlayers);

 /// The current player.
// @property (nonatomic, readonly) NPTournamentPlayer* currentPlayer;
   @Property(selector = "currentPlayer")
   public native NPTournamentPlayer getCurrentPlayer ();

   @Property(selector = "setCurrentPlayer:")
   public native void setCurrentPlayer (NPTournamentPlayer currentPlayer);

 /// An array of the opponents in the tournament (NPTournamentPlayer* elements). Does not contain the current player.
// @property (nonatomic, readonly) NSArray* opponents;
   @Property(selector = "opponents")
   public native NSArray<NPTournamentPlayer> getOpponents ();

   @Property(selector = "setOpponents:")
   public native void setOpponents (NSArray<NPTournamentPlayer> opponents);

}
