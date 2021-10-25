int minOperations(char ** logs, int ls){
    int level = 0;
    for(int i = 0; i < ls; i++){
        if(logs[i][0] != '.'){ 
            level++;
        } else if(strlen(logs[i]) != 2) { 
            level = level == 0 ? level : level - 1;
        }
    }
    return level;
}
