# Quelles sont les causes possibles du problème ? 
Cette adresse IP commençant par 169.254 c'est en fait la classe des lier des adresses locales qui sont utilisés pour faire communiquer le PC au sein d'un réseau local et non pour communiquer avec le routeur et le monde extérieur
# Comment réagissez-vous à ces différents cas ?
Reconfigurez l'adresse IP
netsh int ip reset reset.log
ipconfig / release
ipconfig / renouveler
Réinitialiser l'adresse IP et le masque de sous-réseau
configurer manuellement le réseau 192.168.21.35/16