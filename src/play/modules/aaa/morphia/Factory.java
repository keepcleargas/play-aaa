package play.modules.aaa.morphia;

import play.modules.aaa.IAccount;
import play.modules.aaa.ILog;
import play.modules.aaa.IPrivilege;
import play.modules.aaa.IRight;
import play.modules.aaa.IRole;

public class Factory {
   public static IAccount account() {
      return new Account();
   }
   
   public static IPrivilege privilege() {
      return new Privilege();
   }
   
   public static IRole role() {
       return new Role();
   }
   
   public static IRight right() {
      return new Right();
   }
   
   public static ILog log() {
      return new Log();
   }
}
