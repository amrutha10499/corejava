class TestSocialMedia{

 public static void main(String []args){
 
 SocialMedia S= new SocialMedia();
 System.out.println(S.name);
 System.out.println(S.noOfUsers);

 SocialMedia.uses();
 SocialMedia.chatting();
 
 String res= S.media();
 System.out.println(res);
 S.supports();
 S.effects();
 
 
   }

}

