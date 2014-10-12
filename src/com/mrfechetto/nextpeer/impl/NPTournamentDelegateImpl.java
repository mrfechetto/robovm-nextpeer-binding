package com.mrfechetto.nextpeer.impl;

import org.robovm.apple.foundation.NSObject;

import com.mrfechetto.nextpeer.NPSynchronizedEventFireReason;
import com.mrfechetto.nextpeer.NPTournamentCustomMessageContainer;
import com.mrfechetto.nextpeer.NPTournamentCustomUnreliableMessageContainer;
import com.mrfechetto.nextpeer.NPTournamentDelegate;
import com.mrfechetto.nextpeer.NPTournamentEndDataContainer;

public class NPTournamentDelegateImpl extends NSObject implements NPTournamentDelegate {

   @Override
   public void nextpeerDidReceiveTournamentCustomMessage(NPTournamentCustomMessageContainer message) {
   }

   @Override
   public void nextpeerDidReceiveUnreliableTournamentCustomMessage(NPTournamentCustomUnreliableMessageContainer message) {
   }

   @Override
   public void nextpeerDidReceiveTournamentResults(NPTournamentEndDataContainer tournamentContainer) {
   }

   @Override
   public void nextpeerDidReceiveSynchronizedEvent(String eventName, NPSynchronizedEventFireReason fireReason) {
   }

}
