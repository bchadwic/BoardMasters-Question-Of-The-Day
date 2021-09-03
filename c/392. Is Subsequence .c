bool isSubsequence(char * s, char * t) {
    char * sc = s;
    for (char * tc = t; *tc != '\0'; tc++) {
        if(*sc == '\0')
            return true;
        if(*sc == *tc)
            sc++;
    }
    return *sc == '\0';
}
