public class Magic extends Script 
{ 
   public Magic(mudclient rs) 
   { 
      super(rs); 
   } 
   public String[] getCommands() 
   { 
      return new String[]{"startmagic"}; 
   } 
   public void start(String command, String parameter[]) 
   { 
      DisplayMessage("@gre@STARTED", 3); 
      while (Running()) 
      { 

   if (Fatigue() > 90 && Sleeping() == false) 
               { 
                  DisplayMessage("@blu@SBoT: @red@Sleeping", 3); 
                  Use(FindInv(1263)); 
                  Wait(9000); 
               } 
    
   else 

   {    
   int DEMON = GetNearestNPC(22); 
   SetFightMode(3); 
   MagicNPC(DEMON, 8); 
   Wait(1900); 
   } 
  
      } 
      DisplayMessage("@red@STOPPED", 3); 
   } 
}
