package com.mrfechetto.nextpeer.impl;

import org.robovm.apple.foundation.NSObject;

import com.mrfechetto.nextpeer.NPTournamentStartDataContainer;
import com.mrfechetto.nextpeer.NextpeerDelegate;

public class NextpeerDelegateImpl extends NSObject implements NextpeerDelegate {

   @Override
   public void nextpeerDidTournamentStartWithDetails(NPTournamentStartDataContainer tournamentContainer) {
   }

   @Override
   public void nextpeerDidTournamentEnd() {
   }

   @Override
   public boolean nextpeerSupportsTournamentWithId(String tournamentUuid) {
      return true;
   }

   @Override
   public boolean nextpeerNotSupportedShouldShowCustomError() {
      return false;
   }

   @Override
   public void nextpeerWillTournamentStartWithDetails(NPTournamentStartDataContainer tournamentContainer) {
   }

   @Override
   public void nextpeerDashboardWillAppear() {
   }

   @Override
   public void nextpeerDashboardDidAppear() {
   }

   @Override
   public void nextpeerDashboardWillDisappear() {
   }

   @Override
   public void nextpeerDashboardDidDisappear() {
   }

   @Override
   public void nextpeerDashboardDidReturnToGame() {
   }

   @Override
   public boolean shouldAllowInterGameScreen() {
      return false;
   }

   @Override
   public void nextpeerWillHideToShowInterGameScreen() {
   }
}
