import 'package:kata/sort/sort.dart';
import 'package:test/test.dart';

void main() {
  test('is sorted', () {
    expect([3, 2, 1].isSorted, false);
    expect([1, 2, 3].isSorted, true);
  });
  test('quick sort', () {
    expect([3, 1, 2, 5, 4, 10].quickSort().isSorted, true);

    expect([5, 4, 3, 4].quickSort(), [3, 4, 4, 5]);
  });

  test('is subset of', () {
    final a = [5, 2, 3, 1, 4];
    final b = [2, 1];
    expect(b.isSubsetOf(a), true);
    expect(a.isSubsetOf(b), false);

    final c = [1, 2, 3];
    final d = [4, 5, 6];

    expect(c.isSubsetOf(d), false);
    expect(d.isSubsetOf(c), false);
  });
}
