package com.mrfechetto.nextpeer;

import org.robovm.apple.foundation.NSObjectProtocol;
import org.robovm.objc.annotation.Method;

public interface NPTournamentDelegate extends NSObjectProtocol {
   /**
   This method will be called when Nextpeer has received a buffer from another player.
   You can use these buffers to create custom notifications and events while engaging the other players
   that are currently playing. The container that is passed contains the sending user's name and image as well
   as the message being sent.
   */
//  -(void)nextpeerDidReceiveTournamentCustomMessage:(NPTournamentCustomMessageContainer*)message;
   @Method(selector = "nextpeerDidReceiveTournamentCustomMessage:")
   public void nextpeerDidReceiveTournamentCustomMessage (NPTournamentCustomMessageContainer message);


   /**
    This method will be called when Nextpeer has received a buffer from another player using the unreliable connection.
    You can use these buffers to receive updates about the game state that is going on other players' devices. 
    The container that is passed contains the sending user's name and image as well as the message being sent.
    */
//   -(void)nextpeerDidReceiveUnreliableTournamentCustomMessage:(NPTournamentCustomUnreliableMessageContainer*)message;
   @Method(selector = "nextpeerDidReceiveUnreliableTournamentCustomMessage:")
   public void nextpeerDidReceiveUnreliableTournamentCustomMessage (NPTournamentCustomUnreliableMessageContainer message);

   /**
    This method is invoked whenever the current tournament has finished
    and the platform gathered the information from all the players.
    It might take some time between the call to [NextpeerDelegate nextpeerDidTournamentEnd] to this,
    as the platform retrieving the last result of each player.
    */
//   -(void)nextpeerDidReceiveTournamentResults:(NPTournamentEndDataContainer*)tournamentContainer;
   @Method(selector = "nextpeerDidReceiveTournamentResults:")
   public void nextpeerDidReceiveTournamentResults (NPTournamentEndDataContainer tournamentContainer);

   /**
    Tells the delegate that the synchronized event was fired.
    
    The event will only be fired if you registered for it beforehand with [Nextpeer registerToSynchronizedEvent:withTimetout:].
    
    @param eventName The event that was fired.
    @param fireReason The reason for firing the synchronized event.
    */
//   -(void)nextpeerDidReceiveSynchronizedEvent:(NSString*)eventName withReason:(NPSynchronizedEventFireReason)fireReason;
   @Method(selector = "nextpeerDidReceiveSynchronizedEvent:withReason:")
   public void nextpeerDidReceiveSynchronizedEvent (String eventName, NPSynchronizedEventFireReason fireReason);


}
