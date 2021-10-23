
char * truncateSentence(char * s, int k){
    int words = 0;
    char * p = s;
    while(*p != '\0' && words < k){
       ++p;
       if(*p == ' ') 
           words++; 
    } 
    *p = '\0';
    return s;
}
