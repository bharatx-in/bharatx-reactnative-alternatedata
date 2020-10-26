import * as React from 'react';
import { StyleSheet, View, Text } from 'react-native';
import BharatxReactnativeAlternatedata from 'bharatx-reactnative-alternatedata';

export default function App() {
  const [result, setResult] = React.useState<number | undefined>();

  React.useEffect(() => {
    BharatxReactnativeAlternatedata.register();
    setResult(3);
  }, []);

  return (
    <View style={styles.container}>
      <Text>Result: {result}</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
});
