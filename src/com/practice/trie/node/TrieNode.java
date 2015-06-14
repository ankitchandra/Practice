package com.practice.trie.node;

import java.util.HashMap;

public class TrieNode {
	private Character character;
	private boolean isEnd;
	private HashMap<Character, TrieNode> nodes;

	public TrieNode(char character) {
		this.character = character;
		this.isEnd = false;
		this.nodes = new HashMap();
	}

	public boolean isEnd() {
		return isEnd;
	}

	public Character getValue() {
		return character;
	}

	public HashMap<Character, TrieNode> getChildren() {
		return nodes;
	}

	public void putChild(char ch, TrieNode node) {
		nodes.put(ch, node);
	}

	public void setEnd(boolean isEnd) {
		this.isEnd = isEnd;
	}
}
