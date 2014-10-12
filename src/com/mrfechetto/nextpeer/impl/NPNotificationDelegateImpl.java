package com.mrfechetto.nextpeer.impl;

import org.robovm.apple.foundation.NSObject;

import com.mrfechetto.nextpeer.NPNotificationContainer;
import com.mrfechetto.nextpeer.NPNotificationDelegate;
import com.mrfechetto.nextpeer.NPTournamentStatusInfo;

public class NPNotificationDelegateImpl extends NSObject implements NPNotificationDelegate {

   @Override
   public void nextpeerIsNotificationAllowed(NPNotificationContainer notice) {
   }

   @Override
   public void nextpeerHandleDisallowedNotification(NPNotificationContainer notice) {
   }

   @Override
   public void nextpeerNotificationWillShow(NPNotificationContainer notice) {
   }

   @Override
   public void nextpeerDidReceiveTournamentStatus(NPTournamentStatusInfo tournamentStatus) {
   }

}
