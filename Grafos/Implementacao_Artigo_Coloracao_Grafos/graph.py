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

# max 7 periodos
colors = [ "red", "green", "blue", "orange", "cyan", "magenta", "lightblue" ]

degree_sequence = sorted(G.degree, key=lambda deg: deg[1], reverse=True)

for d in degree_sequence:
    print(d[0]," degree: " , d[1])

used_colors = []
node_colors = {}

for node, _ in degree_sequence:
    # cores dos vizinhos
    neighbor_colors = [node_colors.get(neighbor) for neighbor in G.neighbors(node) if neighbor in node_colors]

    # pegar a primeira cor nao usadas pelos vizinhos
    available_color = next((color for color in colors if color not in neighbor_colors), None)

    if available_color is None:
        print(f"O programa excedeu o max de cores/períodos permitidos no nó {node}.")
        exit(1)
    
    node_colors[node] = available_color
    if available_color not in used_colors:
        used_colors.append(available_color)

colors = [node_colors.get(node, "white") for node in G.nodes()]

print("Cores usadas: ", used_colors)

shells = [courses]
nx.draw_shell(G, nlist=shells, with_labels=True, node_color=colors, edge_color='gray', font_weight='bold', node_size=2000, arrows=True)
plt.show()
