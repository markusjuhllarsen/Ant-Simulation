# Ant-Simulation

Based on DM550 project from fall 2020

The datatypes implemented in these classes are as follows. \
• Instances of Node represent possible locations where ants may be. \
• Instances of Edge correspond to existing paths between two Nodes. \
• Instances of Colony represent special Nodes that also host an ant colony. \
• Instances of Graph correspond to “maps” describing a set of possible locations (Nodes) and legal connections between them (Edges). \
• Instances of Ant represent individual ants. \
• Instances of Simulator correspond to on-going simulations, with a set of instances of Ants placed in different Nodes on a Graph. \
• RandomUtils is a utility class containing static methods to generate random numbers according to predefined distributions. \
• Visualizer is an auxiliary class that provides methods to visualize the current state of the simulation.\
• RunSimulation is the executable top-level class, which is responsible for interacting with the user, setting up the simulation, and managing the main simulation loop by creating and storing instances of its client classes and invoking the appropriate methods on them