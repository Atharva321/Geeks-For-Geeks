    int countzero = 0 ;  
    int countone = 0 ;  
    int counttwo = 0 ;  
    int i = 0 ;  
    while ( i < n )  
    {  
        if ( array [ i ] == 0 )  
        {  
            countzero = countzero + 1 ;  
        }  
        if ( array[ i ] == 1 )  
        {  
            countone = countone + 1 ;  
        }  
                       if ( array[ i ] == 2 )  
        {  
            counttwo = counttwo + 1 ;  
        }  
        i = i + 1 ;  
    }  
    i = 0 ;  
    while ( i < countzero )  
    {  
        array[ i ] = 0 ;  
        i = i + 1 ;  
    }  
    while ( i < countone + countzero )  
    {  
        array[ i ] = 1 ;  
        i = i + 1 ;  
    }  
    while ( i < counttwo + countone + countzero )  
    {  
        array[ i ] = 2 ;  
        i = i + 1 ;  
    }  
