package homework_38;

import java.util.*;

/*
    Построение маршрута.

    У вас есть карта прямых рейсов, где ключ — это название города отправления, а значение — город назначения.

    Необходимо написать функцию, которая принимает карту рейсов, город отправления и
    город назначения и возвращает список городов, через которые проходит маршрут.
    Если прямого рейса нет, функция должна пытаться найти маршрут с пересадками.

     Условия:

    Если прямого рейса нет, нужно искать возможные пересадки через другие города.
    Если маршрут невозможно составить, функция должна возвращать пустой список.
    Предполагается, что нет циклических маршрутов, и из города можно уехать только в один другой город (один к одному соответствие).
*
*/
public class Task4 {
    public static void main(String[] args) {
        Map<String, String> directFlights = new HashMap<>();
        directFlights.put("New York", "Chicago");
        directFlights.put("Chicago", "Denver");
        directFlights.put("Denver", "Las Vegas");
        directFlights.put("Boston", "Miami");
        directFlights.put("Miami", "New York");
        directFlights.put("Los Angeles", "San Francisco");
        directFlights.put("San Francisco", "New York");

        List<String> route = findRoute(directFlights, "Boston", "Los Angeles");
        System.out.println(route);
    }

    public static List<String> findRoute(Map<String, String> map, String startingPoint, String placeOfResidence) {
        List<String> routeList = new ArrayList<>();
        Set<String> visitedCities = new HashSet<>();
        String currentCitie = startingPoint;

        while (currentCitie != null) {
            visitedCities.add(currentCitie);
            routeList.add(currentCitie);

            if (currentCitie.equals(placeOfResidence)) {
                break;
            }
            currentCitie = map.get(currentCitie);
        }
        if (!routeList.contains(placeOfResidence)) {
            return new ArrayList<>();
        }

        return routeList;
    }
}
