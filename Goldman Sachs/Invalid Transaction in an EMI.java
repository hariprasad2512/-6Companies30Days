class Solution{
public List<String> invalidTransactions(String[] transactions) {
      List<String> invalid = new ArrayList<>();
      for(int i=0;i<transactions.length;i++){
          String[] transaction = transactions[i].split(",");
          if(Integer.parseInt(transaction[2]) > 1000){
              invalid.add(transactions[i]);
          }


      }
      for(int i=0;i<transactions.length;i++){
          for(int j=0;j<transactions.length;j++){
              String[] t1 = transactions[i].split(",");
              String[] t2 = transactions[j].split(",");
              if(t1[0].equals(t2[0]) && !t1[3].equals(t2[3]) && i!=j){
                  int time1 = Integer.parseInt(t1[1]);
                  int time2 = Integer.parseInt(t2[1]);
                  if(time2 - time1 < 60){
                      if(!invalid.contains(transactions[i])){
                      invalid.add(transactions[i]);
                      }
                  }

              } 
          }
      }
      return invalid;
    }
}
