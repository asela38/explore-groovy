// http://docs.groovy-lang.org/latest/html/groovy-jdk/java/util/List.html

Range r = 1..<10;

def nums = r.step(1)

println nums
println nums.class.name

def numsLinkedList = [1,2,3] as LinkedList
println numsLinkedList
println numsLinkedList.class.name


nums.push(99)
nums.putAt(0,77)
nums[0] = 88
println nums
println nums + [98, 80]
println nums

nums << 8989
println nums

println nums - 5
println nums.pop()

println nums[7]

println nums.getAt(1..4)

for( x in nums) {
 println x
}

// flatten
nums << [1,2,3]
nums << [[[2]]]
println nums
println nums.flatten()
println nums.unique()



def set = [1,2,3,3] as Set
println set
println set.class.name
