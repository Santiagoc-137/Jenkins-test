#!/bin/bash

# Busca procesos que contengan el nombre de tu clase principal
CLASS_NAME="edu.caldas.Gestion.GestionApplication"

echo "Buscando procesos con: $CLASS_NAME"

# Obtén los PIDs
PIDS=$(pgrep -f "$CLASS_NAME")

if [ -z "$PIDS" ]; then
    echo "No se encontraron procesos activos."
else
    echo "Matando procesos: $PIDS"
    # Mata con SIGTERM primero
    sudo kill $PIDS 2>/dev/null
    sleep 3
    # Fuerza si siguen vivos
    sudo kill -9 $PIDS 2>/dev/null
    echo "Procesos terminados."
fi
