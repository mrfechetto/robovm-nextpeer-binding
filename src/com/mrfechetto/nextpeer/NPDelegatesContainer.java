package com.mrfechetto.nextpeer;

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;

@NativeClass
public class NPDelegatesContainer extends NSObject {

   @Method(selector = "containerWithNextpeerDelegate:")
   public static native NPDelegatesContainer containerWithNextpeerDelegate (NextpeerDelegate aNPDelegate);
   
   @Method(selector = "containerWithNextpeerDelegate:tournamentDelegate:")
   public static native NPDelegatesContainer containerWithNextpeerDelegate (NextpeerDelegate aNPDelegate,
         NPTournamentDelegate aTournamentDelegate);
   
   @Method(selector = "containerWithNextpeerDelegate:notificationDelegate:")
   public static native NPDelegatesContainer containerWithNextpeerDelegate (NextpeerDelegate aNPDelegate,
         NPNotificationDelegate aNoticeDelegate);
   
   @Method(selector = "containerWithNextpeerDelegate:notificationDelegate:tournamentDelegate:")
   public static native NPDelegatesContainer containerWithNextpeerDelegate (NextpeerDelegate aNPDelegate,
         NPNotificationDelegate aNoticeDelegate,
         NPTournamentDelegate aTournamentDelegate);
   
   @Method(selector = "containerWithNextpeerDelegate:notificationDelegate:tournamentDelegate:currencyDelegate:")
   public static native NPDelegatesContainer containerWithNextpeerDelegate (NextpeerDelegate aNPDelegate,
         NPNotificationDelegate aNoticeDelegate,
         NPTournamentDelegate aTournamentDelegate,
         NPCurrencyDelegate aCurrencyDelegate);
   

   
   
   
//   + (NPDelegatesContainer*)containerWithNextpeerDelegate:(id<NextpeerDelegate>)aNPDelegate;
//
//   + (NPDelegatesContainer*)containerWithNextpeerDelegate:(id<NextpeerDelegate>)aNPDelegate
//                                       tournamentDelegate:(id<NPTournamentDelegate>)aTournamentDelegate;
//
//   + (NPDelegatesContainer*)containerWithNextpeerDelegate:(id<NextpeerDelegate>)aNPDelegate
//                                    notificationDelegate:(id<NPNotificationDelegate>)aNoticeDelegate;
//
//   + (NPDelegatesContainer*)containerWithNextpeerDelegate:(id<NextpeerDelegate>)aNPDelegate
//                                     notificationDelegate:(id<NPNotificationDelegate>)aNoticeDelegate 
//                                       tournamentDelegate:(id<NPTournamentDelegate>)aTournamentDelegate;
//
//   + (NPDelegatesContainer*)containerWithNextpeerDelegate:(id<NextpeerDelegate>)aNPDelegate 
//                                     notificationDelegate:(id<NPNotificationDelegate>)aNoticeDelegate 
//                                       tournamentDelegate:(id<NPTournamentDelegate>)aTournamentDelegate 
//                                         currencyDelegate:(id<NPCurrencyDelegate>)aCurrencyDelegate;


}
