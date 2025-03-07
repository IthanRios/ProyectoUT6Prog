package edu.masanz.da.ta.dao;

import edu.masanz.da.ta.dto.*;
import edu.masanz.da.ta.utils.Security;

import java.util.*;

import static edu.masanz.da.ta.conf.Ctes.*;
import static edu.masanz.da.ta.conf.Ini.*;

/**
 * Clase que simula la capa de acceso a datos. Cuando veamos las interfaces crearemos una interfaz para esta clase.
 * También crearemos una clase que implemente esa interfaz y que se conecte a una base de datos relacional.
 * Y una clase servicio que podrá utilizar cualquiera de las dos implementaciones, la simulada, la real u otra.
 * Por ahora, simplemente es una clase con métodos estáticos que simulan la interacción con una base de datos.
 */
public class Dao {


    //region Colecciones que simulan la base de datos
    private static Map<String, Usuario> mapaUsuarios;

    private static Map<Long, Item> mapaItems;

    private static Map<Long, List<Puja>> mapaPujas;
    //endregion

    //region Inicialización de la base de datos simulada
    public static void ini() {
        iniMapaUsuarios();
        iniMapaItems();
        iniMapaPujas();
    }

    private static void iniMapaUsuarios() {
        for(int i = 0; i < USUARIOS.length; i++ ){
            Usuario usuario = new Usuario(USUARIOS[i].split(",")[0],USUARIOS[i].split(",")[1],USUARIOS[i].split(",")[2],USUARIOS[i].split(",")[3]);
            mapaUsuarios.put(USUARIOS[i].split(",")[0],usuario);
        }
    }

    private static void iniMapaItems() {
        for(int i = 0; i < ITEMS.length; i++){
            Item item = new Item((Long.parseLong(ITEMS[i].split(",")[0])),ITEMS[i].split(",")[1],ITEMS[i].split(",")[2],Integer.parseInt(ITEMS[i].split(",")[3]),ITEMS[i].split(",")[4],ITEMS[i].split(",")[5],Integer.parseInt(ITEMS[i].split(",")[6]),Boolean.parseBoolean(ITEMS[i].split(",")[7]));
            mapaItems.put(Long.valueOf(ITEMS[i].split(",")[0]),item);
        }
    }

    private static void iniMapaPujas() {
        for(int i = 0; i < PUJAS.length; i++){
            Puja puja = new Puja(Long.parseLong(PUJAS[i].split(",")[0]), PUJAS[i].split(",")[1], Integer.parseInt(PUJAS[i].split(",")[2]), PUJAS[i].split(",")[3]);
            mapaPujas.put(Long.parseLong(PUJAS[i].split(",")[0]), new ArrayList<>());
            mapaPujas.get(Long.parseLong(PUJAS[i].split(",")[0])).add(puja);
        }
    }
    //endregion

    //region Usuarios
    public static boolean autenticar(String nombreUsuario, String password) {
//        return password.equals("1234");
        // TODO 04 autenticar
        return false;
    }

    public static boolean esAdmin(String nombreUsuario) {
//        return nombreUsuario.equalsIgnoreCase("Admin");
        // TODO 05 esAdmin
        return false;
    }

    public static List<Usuario> obtenerUsuarios() {
        // TODO 06 obtenerUsuarios
        return null;
    }

    public static boolean crearUsuario(String nombre, String password, boolean esAdmin) {
        // TODO 07 crearUsuario
        return true;
    }

    public static boolean modificarPasswordUsuario(String nombre, String password) {
        // TODO 08 modificarPasswordUsuario
        return false;
    }

    public static boolean modificarRolUsuario(String nombre, String rol) {
        // TODO 09 modificarRolUsuario
        return false;
    }

    public static boolean eliminarUsuario(String nombre) {
        // TODO 10 eliminarUsuario
        return true;
    }

    //endregion

    //region Validación de artículos
    public static List<Item> obtenerArticulosPendientes() {
        // TODO 11 obtenerArticulosPendientes
        return null;
    }

    public static boolean validarArticulo(long id, boolean valido) {
        // TODO 12 validarArticulo
        return false;
    }

    public static boolean validarTodos() {
        // TODO 13 validarTodos
        return true;
    }
    //endregion

    //region Gestión de artículos y pujas de administrador
    public static List<ItemPujas> obtenerArticulosConPujas() {
        // TODO 14 obtenerArticulosConPujas
        return null;
    }

    public static boolean resetearSubasta() {
        // TODO 15 resetearSubasta
        return true;
    }

    public static List<PujaItem> obtenerHistoricoGanadores() {
        // TODO 16 obtenerHistoricoGanadores
        return null;
    }
    //endregion

    //region Acciones por parte de usuario normal (no admin)

    public static Item obtenerArticuloPujable(long idArt) {
        // TODO 17 obtenerArticuloPujable
        return null;
    }

    public static List<Item> obtenerArticulosPujables() {
        // TODO 18 obtenerArticulosPujables
        return null;
    }

    public static boolean pujarArticulo(long idArt, String nombre, int precio) {
        // TODO 19 pujarArticulo
        return false;
    }

    public static List<PujaItem> obtenerPujasVigentesUsuario(String nombreUsuario) {
        // TODO 20 obtenerPujasVigentesUsuario
        return null;
    }

    public static boolean ofrecerArticulo(Item item) {
        // TODO 21 ofrecerArticulo
        return true;
    }

    //endregion
}
