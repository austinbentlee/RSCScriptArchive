//Bronze Plate Smelter By ElusioN 

public class BronzePlateSmither extends Script 

{ 
    public BronzePlateSmither(mudclient rs) 
    { 
        super(rs); 

    } 
    public String[] getCommands() 
    { 
        return new String[]{"smithbrnz"}; 

    } 
    public void start(String command, String parameter[]) 

    { 
    DisplayMessage("@cya@E@gr2@l@cya@u@gr2@s@cya@i@gr2@o@cya@N@gr2@: @whi@Bronze Plate Smither script by - @cya@E@gr2@l@cya@u@gr2@s@cya@i@gr2@o@cya@N", 3); 
    while (Running() == true) 
    { 
    Walk(150,503); 
    Wait(100); 

    while (QuestMenu() == false && Running() == true) 
        { 
            int BankerID = GetNearestNPC(95); 
            TalkToNPC(BankerID); 
            Wait(2000); 
        } 

        Answer(0); 

        while (Bank() == false && Running() == true) 
        { 
            Wait(50); 
        } 


        while (Bank() == true && Running() == true) 
        { 
            while(InvCount(117) > 0) 
            { 
                Deposit(117,5); 
                Wait(100); 
            } 

            while(InvCount(169) < 25) 
            { 
                Withdraw(169,1); 
                Wait(100); 
            } 

            CloseBank(); 
        } 
       Walk(150,503); 
            Wait(100); 
            Walk(150,507); 
             Wait(100); 
              Walk(148,512); 
       Wait(100); 
            while (Running() == true && InvCount(117) < 5) 
            { 
         UseOnObject(148,513,5); 
    Wait(1000); 

    for(; !QuestMenu(); Wait(10)); 
         Answer(1); 
         for(; !QuestMenu(); Wait(10)); 
         Answer(2); 
         for(; !QuestMenu(); Wait(10)); 
         Answer(1); 
         Wait(1000); 
         } 
          
     if(Fatigue() > 90 && Running() == true) 
            { 
                while (Sleeping() == false) 
                { 
                    Use(FindInv(1263)); 
                    Wait(3000); 
                } 

                while (Sleeping() == true) 
                { 
                    Wait(200); 
  
          
               } 
           }    
      } 

DisplayMessage("@cya@E@gr2@l@cya@u@gr2@s@cya@i@gr2@o@cya@N@gr2@: @whi@Bronze Plate Smither script by - @cya@E@gr2@l@cya@u@gr2@s@cya@i@gr2@o@cya@N - @red@Stopped", 3); 
} 
}