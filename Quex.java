class Quex{
    private int Front;
    private int Rear;
    private int nitem;
    private int  MaxSize;
    private int array[];


    public Quex(int num){
        this.MaxSize=num;
        Front=0;
        Rear = -1;
        nitem =0;
        array = new int[MaxSize];
    }


    public boolean ISEmpty(){
        return(nitem == 0);
    }

    
    public boolean IsFull(){
        return(Rear == MaxSize-1);
    }



    public void Insert(int number){
        if(IsFull()){
            System.out.println("Array Is Empty");
        }else{
            array[++Rear]=number;
            nitem++;
        }
    }

    public int last_Number(){
        if(ISEmpty()){
            System.out.println("Array IS empty");
        }else{
            return array[Rear];
        }

        return 0;
    }


    public int Delete(){
        if(ISEmpty()){
            System.out.println("Array is Empty");
        }else{
            nitem ++;
            return array[Front++];
        }

        return 0;
    }

    public int MaxNumber(){
        int maxnumber=0;
        for(int a=Front;a<=Rear;a++){
            
            if(maxnumber<=array[a]){
              
               maxnumber=array[a];
              
            }
        }

        return maxnumber;
    }


}