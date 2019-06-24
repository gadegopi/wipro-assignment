class Assignment3
{
    public static void main (String[] args) 
    {
        //PROGRAM FINDS WHETHER THERE IS A COMMAND LINE AGRGUMENT OR NOT AND SEPERATES BY COMMA
        if (args.length ==0)
            {
            System.out.println("No values");
    }
        else{
            for(String i : args)     //for each value in args store in i
                System.out.print(i+" , ");
        
        }
        }
        }
