package com.study.examples.jcf;

import java.util.*;

public class InspectCollections {
    /** Collections from interface List <- Collection <- Iterable */
    public List<String> stringList = new ArrayList<>();
    public LinkedList<String> stringLinkedList = new LinkedList<>();
    public Vector<String> stringVector = new Vector<>();
    public Stack<String> stringStack = new Stack<>();

    /** Collections from interface Queue <- Collection <- Iterable */
    public PriorityQueue<String> stringQueue = new PriorityQueue<>();

    /** Collections from interface Deque <- Queue <- Collection <- Iterable */
    public ArrayDeque<String> stringArrayDeque = new ArrayDeque<>();
    public LinkedList<String> stringLinkedList2 = new LinkedList<>(); //implements List and Deque

    /** Collections from interface Set <- Collection <- Iterable */
    public HashSet<String> stringHashSet = new HashSet<>();
    public LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<>();

    /** Collections from interface SortedSet <- Set <- Collection <- Iterable */
    public TreeSet<String> stringTreeSet = new TreeSet<>();

    /** Collections from interface Map */
    public HashMap<Long, String> longStringHashMap = new HashMap<>();
    public LinkedHashMap<Long, String> longStringLinkedHashMap = new LinkedHashMap<>();

    /** Collections from interface NavigableMap <- SortedMap <- Map */
    public TreeMap<Long, String> longStringTreeMap = new TreeMap<>();
}
