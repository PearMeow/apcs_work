Team Pom Pom: Max Schneider, Perry Huang, Oscar Breen
APCS pd07
HW93 -- exploring tree properties, extracting actionable intel from traversals
2022-05-05
time spent: 0.5 hrs


DISCO
------------------------------------------------
* A tree can be all 3 types at once.
================================================


QCC
------------------------------------------------
* Why do balanced and complete trees exist?
================================================


SELF-ASSESSMENT PROMPTS
------------------------------------------------
In which direction does a tree grow?
Down.

Provide as many alternate definitions as you can for "tree," using graph terminology ("closed/open tours", "paths", "cycles", etc). Maximize clarity, succinctness.
An abstract representing all paths to all children of a parent.
Undirected graph where any 2 vertices are connected by exactly 1 path.


Why is a balanced tree allowed a difference of 1 in height between right and left subtrees?
It increases efficiency, limiting how far a tree can go without getting to a leaf, decreasing search time as the traversal down an extra layer
Is no longer needed as much as it would be in an unbalanced tree

Alternate (equivalent, but more succinct?) definitions of "balanced" tree?
Each leaf either differs by depth of one with its neighbor leaf or not at all.

Is a perfect tree complete? 
Yes, because all levels are completely filled so therefore the last level is left justified.

Is a complete tree balanced? 
Yes, because there is not more than a difference of 1 in height.

Is the Man Who Is Tall Happy?
https://en.wikipedia.org/wiki/Is_the_Man_Who_Is_Tall_Happy%3F

What must be true of perfect trees but not others?
There has to be the maximum nodes at the bottom level and none of them can have children.
================================================


C'EST POSSIBLE?
------------------------------------------------
Yes, because you can figure out where nodes end using the post order traversal and you can figure out what the order of the nodes are using the pre order traversal.
================================================