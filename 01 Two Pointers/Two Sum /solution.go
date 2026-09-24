package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func split(s string) []string {
	if s == "" {
		return []string{}
	}
	return strings.Split(s, " ")
}

func arrAtoi(a []string) []int {
	res := []int{}
	for _, v := range a {
		val, _ := strconv.Atoi(v)
		res = append(res, val)
	}
	return res
}

func twoSum(a []int, target int) []int {
	l := 0
	h := len(a) - 1
	for l < h {
		sum := a[l] + a[h]
		if sum < target {
			l++
		} else if sum > target {
			h--
		} else {
			return []int{l + 1, h + 1}
		}
	}
	return []int{}
}

func main() {
	scan := bufio.NewScanner(os.Stdin)
	fmt.Println("Enter the elements : ")
	scan.Scan()
	list := arrAtoi(split(scan.Text()))
	fmt.Println("Enter the target : ")
	scan.Scan()
	target, _ := strconv.Atoi(scan.Text())
	fmt.Println("Result : ", twoSum(list, target))
}
