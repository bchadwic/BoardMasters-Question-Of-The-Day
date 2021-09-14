unsigned short m(unsigned short x, unsigned short y) {
    return x < y ? x : y;
}

int maxNumberOfBalloons(char * text){
    unsigned short alpha[26] = {0};
    for(unsigned short i = 0; text[i] != '\0'; alpha[text[i++] - 'a']++) 
        ;
    return m(alpha[1],                      //b             
               m(alpha[0],                  //a                         
                   m(alpha[11] / 2,         //ll 
                       m(alpha[14] / 2,     //oo
                             alpha[13])))); //n
}
