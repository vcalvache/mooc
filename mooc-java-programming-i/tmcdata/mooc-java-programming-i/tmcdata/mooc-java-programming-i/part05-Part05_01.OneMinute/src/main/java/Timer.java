public class Timer {
    private int hundredthsOFSeconds;
    private int seconds;

    public Timer(){
        this.hundredthsOFSeconds = 0;
        this.seconds = 0;
    }

    public void advance(){
        this.hundredthsOFSeconds++;
        if (this.hundredthsOFSeconds == 100){
            this.hundredthsOFSeconds = 0;
            this.seconds++;
            if (this.seconds == 60){
                this.seconds = 0;
            }
        }
    }
    
    @Override
    public String toString(){
        if (this.seconds <10 && this.hundredthsOFSeconds <10) {
            return "0"+this.seconds+":0"+this.hundredthsOFSeconds;
            
        } else if (this.seconds < 10){
            return "0"+this.seconds+":"+this.hundredthsOFSeconds;
        } else if (this.hundredthsOFSeconds <10){
            return this.seconds+":0"+this.hundredthsOFSeconds;
        }   
        return this.seconds+":"+ this.hundredthsOFSeconds;
    }
}      