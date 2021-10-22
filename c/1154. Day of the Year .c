typedef unsigned char boolean;

int stringPairToInt(char * pair){
        return pair[0] == '0' ? pair[1] - '0' : (pair[0] - '0') * 10 + (pair[1] - '0'); 
}
    
int dayOfYear(char * date){
    // get the date in numeric format
    int year = 0;
    for(int i = 1, j = 3; i <= 1000; i*=10, j--) 
        year += (date[j] - '0') * i;
    int month = stringPairToInt(&date[5]);
    int day = stringPairToInt(&date[8]);
    boolean leap_year = (year % 4 == 0);
                        

    // loop through and add up the days
    int day_of_year = 0;
    for(int i = 1; i < month; i++){
        switch(i) {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12: // 31 day months
            day_of_year += 1;
        case 4: case 6: case 9: case 11: // 30 day months
            day_of_year += 30;
            break;
        case 2: // Feb. dependant on leap year                                                  
            day_of_year += leap_year ? 29 : 28;
            break;
        }
    }
    return day_of_year + day;
}
