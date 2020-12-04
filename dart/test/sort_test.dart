import 'package:kata/sort/quick_sort.dart';
import 'package:test/test.dart';

void main() {
  test('quick sort', () {
    final quickSort = QuickSort();

    expect(quickSort.sort([3, 1, 2, 5, 4, 10]), [1, 2, 3, 4, 5, 10]);
  });
}