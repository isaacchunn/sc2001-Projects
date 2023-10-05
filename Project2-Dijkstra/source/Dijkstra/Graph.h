#ifndef GRAPH_H
#define GRAPH_H

#include <unordered_map>
#include <vector>
#include "ListNode.h"
#include "../Misc/DataHandler.h"

using namespace std;

class Graph
{
	public:
		Graph();
		~Graph();

		//Public for ease of accessibility as I want functions so I dont use struct.
		int V;
		int E;

		vector<vector<int>> adjMatrix;
		vector<ListNode*> adjList;
		unordered_map<int,Node*> nodes;
		
		//Functions
		void SetNoOfVertices(int vertices);
		void Clear();
		void UpdateAdjacencyList();
		//CSV
		bool LoadGraph(std::string file);
		bool ExportGraph(std::string file);
		//Node addition and deletion later on
		//Printing
		void PrintAdjMatrix();
		void PrintAdjList();

		
};

#endif

