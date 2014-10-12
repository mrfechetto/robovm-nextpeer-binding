package com.mrfechetto.nextpeer;

import org.robovm.rt.bro.ValuedEnum;

public enum NPSynchronizedEventFireReason implements ValuedEnum {
   /// All participants have registered for the event.
   NPSynchronizedEventFireReasonAllReached(1),
   
   /// The registration timeout was reached before all participants registered for the event (at least one participant didn't register for the event).
   NPSynchronizedEventFireReasonTimeout(2),
   
   /// The synchronized event was already fired before the latest registration attempt was made.
   NPSynchronizedEventFireReasonAlreadyFired(3);

   private final long _value;
   
   private NPSynchronizedEventFireReason (long aValue) {
      _value = aValue;
   }
   
   @Override
   public long value() {
      return _value;
   }

}
