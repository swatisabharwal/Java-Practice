package dataStructures;

public class BinaryTree {
	Node root;

	public void addNode(int key, String name) {
		Node newNode = new Node(key, name);
		if (root == null) {
			root = newNode;
		} else {
			Node focusNode = root;
			Node parent;
			while (true) {
				parent = focusNode;
				if (key < focusNode.key) {
					focusNode = focusNode.leftchild;
					if (focusNode == null) {
						parent.leftchild = newNode;
						return;

					}
				} else {
					focusNode = focusNode.rightChild;
					if (focusNode == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class Node {
		int key;
		String name;
		Node leftchild;
		Node rightChild;

		Node(int key, String name) {
			this.key = key;
			this.name = name;
		}

		public String toString() {
			return name + "::" + key;
		}
	}

}
