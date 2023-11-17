public class conditionals {
    public String question;
    public int randomInt= 7;
    public static void main(String[] args){
        conditionals MyCode=new conditionals();
    }
    //change
    public conditionals(){
       // question= "are elephants gray?";
        //System.out.println(question);
        question= "will i be on santas nice list?";
        System.out.println(question);
        int randomInt;
        randomInt = ((int)(Math.random()*10));
        if (randomInt==1){
            System.out.println("without a doubt");;
        }else if (randomInt==2){
            System.out.println("better not tell you now");;
        }else if (randomInt==3){
            System.out.println("Very doubtful");;
        }else if (randomInt==4){
            System.out.println("As I see it, Yes");;
        }else if (randomInt==5){
            System.out.println("if you say it 1000 times, yes");;
        }else if (randomInt==6){
            System.out.println("only if you have a dog");;
        }else if (randomInt==7){
            System.out.println("i would have to say maybe");;
        }else if (randomInt==8){
            System.out.println("my brain syas no but the ball is saying yes");;
        }else if (randomInt==9){
            System.out.println("sneaky no");;
        }else if (randomInt==10){
            System.out.println("sneaky yes");;
        }
    }

}
