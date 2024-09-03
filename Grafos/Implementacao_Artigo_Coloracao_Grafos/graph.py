import networkx as nx
import matplotlib.pyplot as plt

# honours
coursesH = [
    "FIS(H)", 
    "QUI(H)", 
    "MAT(H)", 
    "ECO(H)", 
    "CCO(H)"
]

# general
coursesG = [
    "FIS(G)", 
    "QUI(G)", 
    "MAT(G)", 
    "CCO(G)",
    "EST(G)",
    "ELE(G)"
]

courses = coursesH + coursesG

conflicts = [
    # Arestas cursos h -> g
    ("MAT(H)", "CCO(G)"),
    ("MAT(H)", "QUI(G)"),
    ("MAT(H)", "FIS(G)"),
    ("MAT(H)", "EST(G)"),
    ("FIS(H)", "MAT(G)"),
    ("FIS(H)", "CCO(G)"),
    ("FIS(H)", "QUI(G)"),
    ("FIS(H)", "ELE(G)"),
    ("ECO(H)", "MAT(G)"),
    ("ECO(H)", "EST(G)"),
    ("ECO(H)", "CCO(G)"),
    ("QUI(H)", "MAT(G)"),
    ("QUI(H)", "FIS(G)"),
    ("QUI(H)", "CCO(G)"),
    ("QUI(H)", "MAT(G)"),
    ("QUI(H)", "FIS(G)"),
    ("QUI(H)", "CCO(G)"),
    ("CCO(H)", "MAT(G)"),

    # arestas g <-> g
    ("MAT(G)", "CCO(G)"),
    ("MAT(G)", "QUI(G)"),
    ("MAT(G)", "ELE(G)"),
    ("MAT(G)", "FIS(G)"),
    ("MAT(G)", "EST(G)"),
    ("CCO(G)", "FIS(G)"),
    ("QUI(G)", "FIS(G)"),
]

G = nx.Graph()
G.add_nodes_from(courses)
G.add_edges_from(conflicts)


available_colors = [ "red", "green", "blue", "orange", "cyan", "magenta" ]

degree_sequence = sorted(G.degree, key=lambda deg: deg[1], reverse=True)

used_colors = []
node_colors = {}

for node, _ in degree_sequence:
    # buscar a cor disponivel nos vizinhos
    neighbor_colors = {node_colors.get(neighbor) for neighbor in G.neighbors(node) if neighbor in node_colors}
    
    # atribuir a menor cor disponivel
    for color in available_colors:
        if color not in neighbor_colors:
            node_colors[node] = color
            if color not in used_colors:
                used_colors.append(color)
            break


node_color_list = [node_colors.get(node, "white") for node in G.nodes()]

print(f"Cores usadas: {used_colors}")
print(f"Cores dos nós: {node_colors}")

shells = [courses]
nx.draw_shell(G, nlist=shells, with_labels=True, node_color=node_color_list, edge_color='gray', font_weight='bold', node_size=2000, arrows=True)
plt.show()
