package com.mrfechetto.nextpeer;

import org.robovm.apple.foundation.NSObjectProtocol;
import org.robovm.objc.annotation.Method;

public interface NPCurrencyDelegate extends NSObjectProtocol {

   /**
   Nextpeer will call this function to retrieve the current amount of currency the player has.
   */
//  - (uint32_t)nextpeerGetCurrency;
   @Method(selector = "nextpeerGetCurrency:")
   public int nextpeerGetCurrency ();

   /**
   Nextpeer will use this function to add a certain amount of currency to the total a player has.
   This may be a result of currency consumption (negative amount, for example when entering a tournament)
   or a currency gain (positive amount, when winning a tournament).
   
   @warning This method may be called on any thread, including the main thread! Take precaution when receiving this callback
            and be sure to return quickly (i.e. do I/O in another thread) in order to have everything run smoothly.
   */
//  - (void)nextpeerAddAmountToCurrency:(int32_t)amount;
   @Method(selector = "nextpeerAddAmountToCurrency:")
   public void nextpeerAddAmountToCurrency (int amount);
   
   /**
   Nextpeer will query this method to find out if the game supports the unified currency model.
   Note that this will only be called once per Nextpeer initialization.
   */
//  - (BOOL)nextpeerSupportsUnifiedCurrency;
   @Method(selector = "nextpeerSupportsUnifiedCurrency:")
   public boolean nextpeerSupportsUnifiedCurrency ();
}
