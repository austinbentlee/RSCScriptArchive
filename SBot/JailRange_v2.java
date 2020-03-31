//Shoot random not untill dead
    public class JailRange_v2 extends Script {
    public JailRange_v2(mudclient mudclient) {
        super(mudclient);
    }
    public String[] getCommands()
    {
        return (new String[] {
            "jail2"
        });
    }
    public boolean NPCCoordsIn(int x1,int y1,int x2,int y2,int Id) {
       if(Id != -1) {
          if(NPCX(Id) >= x1) {
             if(NPCX(Id) <= x2) {
                if(NPCY(Id) >= y1) {
                   if(NPCY(Id) <= y2) {
                      return true;
                   } else return false;
                } else return false;
             } else return false;
          } else return false;
   } else return false;
    }
    public boolean OnRangeSpot(int x,int y) {
       if(GetX() == x) {
          if(GetY() == y) {
             return true;
          } else return false;
       } else return false;
    }   
    public boolean WrongNPC;       
    public void start(String s, String as[]) {
       DisplayMessage("@gr2@MicH@whi@: Jail Ranger v2[@gr2@Loaded@whi@]",3);
       int MacroWait = 750;
   while(Running()) {
      while(OnRangeSpot(285,659)) {
         if(Fatigue() < 100) {
            //Pirate
            int Pirate = GetNearestNPC(137);
            if(Pirate != -1) {
               WrongNPC = false;
               AttackNPC(Pirate);
               long l = System.currentTimeMillis();
               while(Pirate != -1  && System.currentTimeMillis() - l <= MacroWait && !WrongNPC) {
                  Wait(50);
                  Pirate = GetNearestNPC(137);
                  if(Pirate == -1) {
                     WrongNPC = true;
                  }
               }
            }
            //Thief
            int Thief = GetNearestNPC(64);
            if(Thief != -1 && NPCCoordsIn(282,655,284,657,Thief)) {
               WrongNPC = false;
               AttackNPC(Thief);
               long l = System.currentTimeMillis();
               while(Thief != -1  && System.currentTimeMillis() - l <= MacroWait && !WrongNPC) {
                  Wait(50);
                  Thief = GetNearestNPC(64);
                  if(Thief == -1) {
                     WrongNPC = true;
                  }
               }
            }
            //WormBrain
            int WormBrain = GetNearestNPC(192);
            if(WormBrain != -1) {
               WrongNPC = false;
               AttackNPC(WormBrain);
               long l = System.currentTimeMillis();
               while(WormBrain != -1  && System.currentTimeMillis() - l <= MacroWait && !WrongNPC) {
                  Wait(50);
                  WormBrain = GetNearestNPC(192);
                  if(WormBrain == -1) {
                     WrongNPC = true;
                  }
               }
            }
            //Mugger
            int Mugger = GetNearestNPC(21);
            if(Mugger != -1) {
               WrongNPC = false;
               AttackNPC(Mugger);
               long l = System.currentTimeMillis();
               while(Mugger != -1  && System.currentTimeMillis() - l <= MacroWait && !WrongNPC) {
                  Wait(50);
                  Mugger = GetNearestNPC(21);
                  if(Mugger == -1) {
                     WrongNPC = true;
                  }
               }
            }
            Wait(100);
         }
         if(Fatigue() == 100) {
            if(!Sleeping()) {
               Use(FindInv(1263));
               Wait(2000);
            }
            while(Sleeping()) {
               Wait(100);
            }
         }   
      }
      while(!OnRangeSpot(285,659)) {
         ForceWalkNoWait(285,659);
         Wait(MacroWait);
      }
   }
    }
}