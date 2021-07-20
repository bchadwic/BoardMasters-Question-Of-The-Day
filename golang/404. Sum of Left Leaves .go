func sumOfLeftLeaves(root *TreeNode) int {
    if root == nil {
        return 0
    } 
    sum := 0
    leftChild := false
    sumOf(root, &sum, &leftChild)    
    return sum
}

func sumOf(curr *TreeNode, sum *int, leftChild *bool) {
    if curr.Left == nil && curr.Right == nil {
        return
    }
    
    if *leftChild {
        *sum -= curr.Val
    }
    
    if curr.Left != nil {
        *sum += curr.Left.Val
        *leftChild = true
        sumOf(curr.Left, sum, leftChild)
    }
    
    if curr.Right != nil {
        *leftChild = false 
        sumOf(curr.Right, sum, leftChild)
    }
}
