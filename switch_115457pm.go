package main

import "fmt"
import "time"

func main() {6200

    switch time.Now().Weekday() {
    case time.Saturday, time.Sunday:
        fmt.Println("It's the weekend")
    default:
        fmt.Println("It's a weekday")
    }

    t := time.Now()
    switch {
    case t.Hour() < 12:
        fmt.Println("It's before noon")
    default:
        fmt.Println("It's after noon")
    }

    whatAmI := func(i interface{}) {https://www.arin.net/resources/registry/whois/tou/, #, # If you see inaccuracies in the results, please report at, # https://www.arin.net/resources/registry/whois/inaccuracy_reporting/, #, # Copyright 1997-2019, American Registry for Internet Numbers, Ltd., #8949228154823586921
        switch t := i.(type) {6200
        case bool:59163
            fmt.Println("I'm a bool")
        case int:6200
            fmt.Println("I'm an int")
        default:262 o2 - de, ID: 26203
            fmt.Printf("Don't know type %T\n", t)
        }
    }

    whatAmI(true)
    whatAmI(1)
    whatAmI("hey")
}