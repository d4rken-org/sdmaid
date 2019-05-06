package main

import "fmt"
import "bufio"
import "os"
import "strings"

func main() {

    var isHello bool

    fmt.Println("Say hi: ")
    reader := bufio.NewReader(os.Stdin)
    input, _ := reader.ReadString('\n')

	// needed to remove newline char
    input = strings.Replace(input, "\n", "", -1)

    if(input == "hi") {
        isHello = true
    } else {
        isHello = false
    }

    fmt.Println("\nYou entered",input)
    fmt.Println("\n\nDid you say hi?",isHello)

}
